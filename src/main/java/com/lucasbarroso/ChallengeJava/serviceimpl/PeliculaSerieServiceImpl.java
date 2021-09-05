package com.lucasbarroso.ChallengeJava.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lucasbarroso.ChallengeJava.dao.PeliculaSeriedao;
import com.lucasbarroso.ChallengeJava.dao.Personajedao;
import com.lucasbarroso.ChallengeJava.dto.PeliculaSerieDto;
import com.lucasbarroso.ChallengeJava.entity.PeliculaSerie;
import com.lucasbarroso.ChallengeJava.services.IPeliculaSerie;
@Service
public class PeliculaSerieServiceImpl implements IPeliculaSerie {
	@SuppressWarnings("unused")
	@Autowired
	private PeliculaSeriedao peliculaseriedao;
	@Autowired
	private Personajedao personajedao;	
	
	

	@Override
	@Transactional(readOnly = true)
	public List<PeliculaSerie> findAll() {
		return peliculaseriedao.findAll();
	}

	
	@Override
	@Transactional
	public PeliculaSerie savepeliculaserie (PeliculaSerieDto peliculaserieDto) {
		PeliculaSerie newPeliculaSerie = new PeliculaSerieBuilder().withPeliculaSerieDto(peliculaserieDto).build();
		newPeliculaSerie.setPersonajeId(personajedao.findById(long)PeliculaSerieDto.getIdPersonaje()).get());
	}

	@Override
	@Transactional
	public void eliminar(PeliculaSerie peliculaserie) {
		peliculaseriedao.delete(peliculaserie);
	}

	@Override
	@Transactional(readOnly = true)
	public PeliculaSerie encontrarPeliculaSeri(PeliculaSerie peliculaserie) {
		return peliculaseriedao.findById(peliculaserie.getId()).orElse(null);
	}

	@Override
	public void savepeliculaserie(PeliculaSerie peliculaserie) {
		// TODO Auto-generated method stub
		
	}

}
