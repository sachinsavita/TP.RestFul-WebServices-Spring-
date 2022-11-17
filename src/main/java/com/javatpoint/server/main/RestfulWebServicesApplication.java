package com.javatpoint.server.main;

import java.util.Locale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.WebProperties.LocaleResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.i18n.AcceptHeaderLocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@SpringBootApplication
public class RestfulWebServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServicesApplication.class, args);		
		
	}
	
	@Bean  
	public AcceptHeaderLocaleResolver localeResolver() // SessionLocaleResolver -->> Changed to AcceptHeaderLocaleResolver
	{  
		AcceptHeaderLocaleResolver localeResolver = new AcceptHeaderLocaleResolver();  
	localeResolver.setDefaultLocale(Locale.US);  
	return localeResolver;  
	} 
	
	//configuring ResourceBundle  
//	@Bean  
//	public ResourceBundleMessageSource bundleMessageSource()  
//	{  
//	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();  
//	messageSource.setBasename("messages");  
//	return messageSource;  
//	}  
	
	
	
	
	//can comment if added 
//	logging.level.org.springframework=info  
//	spring.messages.basename=messages 
//	
//	in application.properties file

}
