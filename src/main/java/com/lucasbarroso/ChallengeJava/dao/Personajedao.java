package com.lucasbarroso.ChallengeJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lucasbarroso.ChallengeJava.entity.Personaje;

@Repository
public interface Personajedao extends JpaRepository<Personaje, Long> {
	
}
