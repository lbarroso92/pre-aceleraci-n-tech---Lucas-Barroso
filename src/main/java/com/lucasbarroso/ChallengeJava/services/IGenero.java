package com.lucasbarroso.ChallengeJava.services;

import java.util.List;

import com.lucasbarroso.ChallengeJava.entity.Genero;

public interface IGenero {
	public List<Genero> ListarGenero();

	public void guardar(Genero personaje);

	public void eliminar(Genero personaje);

	public Genero encontrarGenero(Genero genero);

}
