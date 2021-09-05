package com.lucasbarroso.ChallengeJava.services;

import java.util.List;

import com.lucasbarroso.ChallengeJava.entity.Personaje;

public interface IPersonaje {
	public List<Personaje> ListarPersonaje();

	public void savepersonaje(Personaje personaje);

	public void deletepersonaje(Personaje personaje);

	public Personaje findallpersonaje(Personaje personaje);

}
