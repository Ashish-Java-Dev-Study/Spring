package com.myapp.demo.config.server.infra.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * The type Request filter.
 */
@Component
public class RequestFilter extends OncePerRequestFilter {
    /**
     * The Log.
     */
    Logger LOG = LoggerFactory.getLogger(RequestFilter.class.getName());

    @Override
    protected void doFilterInternal(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws ServletException, IOException {
        LOG.info("[ FILTER]\t[ URL ] " + req.getRequestURI() + "\t[ REQUEST-TYPE ] " + req.getMethod());
        chain.doFilter(req, res);
    }
}
