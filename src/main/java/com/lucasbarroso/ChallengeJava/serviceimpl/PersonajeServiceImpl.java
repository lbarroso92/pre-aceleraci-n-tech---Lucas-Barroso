package com.lucasbarroso.ChallengeJava.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasbarroso.ChallengeJava.dao.PeliculaSeriedao;
import com.lucasbarroso.ChallengeJava.dao.Personajedao;
import com.lucasbarroso.ChallengeJava.entity.Personaje;
import com.lucasbarroso.ChallengeJava.services.IPersonaje;

@Service
public class PersonajeServiceImpl implements IPersonaje {
	@Autowired
	private Personajedao personajedao;
	@Override
	@Transactional(readOnly = true)
	public List<Personaje> ListarPersonaje() {
		return (List<Personaje>) personajedao.findAll();
	}

	@Override
	@Transactional
	public void savepersonaje(Personaje personaje) {
		personajedao.save(personaje);
	}

	@Override
	@Transactional
	public void deletepersonaje(Personaje personaje) {
		personajedao.delete(personaje);
	}

	@Override
	@Transactional(readOnly = true)
	public Personaje findallpersonaje(Personaje personaje) {
		return personajedao.findById(personaje.getId()).orElse(null);
	}

}
