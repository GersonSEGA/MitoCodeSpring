package com.mitocode;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.mitocode.model.Persona;
import com.mitocode.service.IPersonaService;
import com.mitocode.service.PersonaServiceImpl;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean(name = "personaService")
	public IPersonaService personaService() {
		return new PersonaServiceImpl();
	}
	
	@Bean(name = "persona")
	public Persona persona() {
		return new Persona();
	}

}
