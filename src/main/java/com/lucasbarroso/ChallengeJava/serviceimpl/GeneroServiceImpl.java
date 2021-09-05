package com.lucasbarroso.ChallengeJava.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasbarroso.ChallengeJava.dao.Generodao;
import com.lucasbarroso.ChallengeJava.entity.Genero;
import com.lucasbarroso.ChallengeJava.services.IGenero;

@Service
public class GeneroServiceImpl implements IGenero {
	@SuppressWarnings("unused")
	@Autowired
	private Generodao generodao;

	@Override
	@Transactional(readOnly = true)
	public List<Genero> ListarGenero() {
		return (List<Genero>) generodao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Genero genero) {
		generodao.save(genero);
	}

	@Override
	@Transactional
	public void eliminar(Genero genero) {
		generodao.delete(genero);
	}

	@Override
	@Transactional(readOnly = true)
	public Genero encontrarGenero(Genero genero) {
		return generodao.findById(genero.getId()).orElse(null);
	}

}
