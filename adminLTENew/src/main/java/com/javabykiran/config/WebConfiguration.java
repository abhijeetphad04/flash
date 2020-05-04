package com.javabykiran.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.javabykiran.logger.LoggingCode;


@Configuration
@EnableWebMvc
@ComponentScan("com.javabykiran")
@EnableScheduling
@EnableAsync
@EnableAspectJAutoProxy
public class WebConfiguration implements WebMvcConfigurer {
	@Bean
	public InternalResourceViewResolver myresolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/pages/admin/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/bootstrap/**").addResourceLocations("/WEB-INF/pages/bootstrap/");
		registry.addResourceHandler("/dist/**").addResourceLocations("/WEB-INF/pages/dist/");
		registry.addResourceHandler("/pages/**").addResourceLocations("/WEB-INF/pages/pages/");
		registry.addResourceHandler("/plugins/**").addResourceLocations("/WEB-INF/pages/plugins/");
	}
	
	@Bean
	LoggingCode getLogging() {
		return new LoggingCode();
	}

	
}
