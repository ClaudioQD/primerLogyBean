package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.negocio.Persona;

@SpringBootApplication
public class DemoApplication {

	
	private final static Logger log=LoggerFactory.getLogger(DemoApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(DemoApplication.class, args);
		
		
		

		ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfiguration.class);

		Persona persona = appContext.getBean(Persona.class);

		persona.setNombre("claudio");
		persona.setEdad(12);
		System.out.println("Se inyecta la persona con spring:  "+persona.toString());

		log.info("persona inyectada");
		
		log.error("ocurrio un error");
	}

}
