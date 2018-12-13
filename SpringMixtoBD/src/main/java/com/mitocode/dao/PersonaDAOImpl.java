package com.mitocode.dao;

import org.springframework.stereotype.Repository;

import com.mitocode.model.Persona;

@Repository
public class PersonaDAOImpl implements IPersonaDAO {

	@Override
	public void create(Persona persona) {
		System.out.println("Persona creada " + persona.getNombres());
	}

}
