package com.mitocode;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;

public class App {

	public static void main(String[] args) {

		AbstractApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		IPersonaService service = (IPersonaService) context.getBean("personaService");
		service.crear();

		Persona persona = (Persona) context.getBean("persona");
		/*
		 * persona.setId(1); persona.setNombres("Gerson Antony");
		 * persona.setApellidos("Sanchez Esparza");
		 */

		System.out.println(persona.getId() + "-" + persona.getNombres() + "-" + persona.getApellidos());
		
		context.close();

	}

}
