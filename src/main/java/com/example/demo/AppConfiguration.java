package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.negocio.Persona;

@Configuration
public class AppConfiguration {

	
	@Bean
	public Persona persona() {
	return new Persona();
		
	}
	
}
