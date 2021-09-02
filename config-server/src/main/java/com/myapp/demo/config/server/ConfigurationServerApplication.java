package com.myapp.demo.config.server;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.message.LoggerNameAwareMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.env.AbstractEnvironment;
import org.springframework.core.env.EnumerablePropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;

import java.util.Arrays;
import java.util.stream.StreamSupport;

/**
 * The type Configuration server application.
 */
@SpringBootApplication
public class ConfigurationServerApplication {

	/**
	 * The Logger.
	 */
	Logger LOGGER = LoggerFactory.getLogger(ConfigurationServerApplication.class.getName());

	@Autowired
	private Environment env;

	/**
	 * The entry point of application.
	 *
	 * @param args the input arguments
	 */
	public static void main(String[] args) {
        SpringApplication.run(ConfigurationServerApplication.class, args);
    }

	/**
	 * Handle context refresh.
	 *
	 * @param event the event
	 */
	@EventListener
	public void handleContextRefresh(ContextRefreshedEvent event) {
/*		final Environment env = event.getApplicationContext().getEnvironment();
		LOGGER.debug("====== Environment and configuration ======");
		LOGGER.debug("Active profiles: {}", Arrays.toString(env.getActiveProfiles()));
		final MutablePropertySources sources = ((AbstractEnvironment) env).getPropertySources();
		StreamSupport.stream(sources.spliterator(), false)
				.filter(ps -> ps instanceof EnumerablePropertySource)
				.map(ps -> ((EnumerablePropertySource) ps).getPropertyNames())
				.flatMap(Arrays::stream)
				.distinct()
				.filter(prop -> !(prop.contains("credentials") || prop.contains("password")))
				.forEach(prop -> LOGGER.debug("{}: {}", prop, env.getProperty(prop)));
		LOGGER.debug("===========================================");*/
	}

}
