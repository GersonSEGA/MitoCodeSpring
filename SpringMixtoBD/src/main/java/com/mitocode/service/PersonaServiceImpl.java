package com.mitocode.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.mitocode.dao.IPersonaDAO;
import com.mitocode.model.Persona;

public class PersonaServiceImpl implements IPersonaService {
	
	@Autowired
	private IPersonaDAO dao;

	@Override
	public void create(Persona persona) {
		dao.create(persona);
	}

}