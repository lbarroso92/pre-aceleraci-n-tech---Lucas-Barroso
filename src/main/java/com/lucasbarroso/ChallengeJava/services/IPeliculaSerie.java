package com.lucasbarroso.ChallengeJava.services;

import java.util.List;

import com.lucasbarroso.ChallengeJava.dto.PeliculaSerieDto;
import com.lucasbarroso.ChallengeJava.entity.PeliculaSerie;

public interface IPeliculaSerie {
	public List<PeliculaSerie> findAll();

	public void savepeliculaserie(PeliculaSerie peliculaserie);

	public void eliminar(PeliculaSerie peliculaserie);

	public PeliculaSerie encontrarPeliculaSeri(PeliculaSerie peliculaserie);


}
