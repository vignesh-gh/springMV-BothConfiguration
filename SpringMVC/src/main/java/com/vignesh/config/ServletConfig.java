package com.vignesh.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceView;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.vignesh.config")
public class ServletConfig {
	
	@Bean
	public InternalResourceViewResolver viewJsp() {
		InternalResourceViewResolver ir= new InternalResourceViewResolver();
		ir.setPrefix("WEB-INF/jsp/");
		ir.setSuffix(".jsp");
		return ir;
	}

}
