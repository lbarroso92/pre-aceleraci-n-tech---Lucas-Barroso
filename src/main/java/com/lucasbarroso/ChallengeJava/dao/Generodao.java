package com.lucasbarroso.ChallengeJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lucasbarroso.ChallengeJava.entity.Genero;

@Repository
public interface Generodao extends JpaRepository<Genero, Long> {

}
