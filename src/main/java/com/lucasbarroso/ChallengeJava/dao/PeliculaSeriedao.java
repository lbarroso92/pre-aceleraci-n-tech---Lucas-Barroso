package com.lucasbarroso.ChallengeJava.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.lucasbarroso.ChallengeJava.entity.PeliculaSerie;

@Repository
public interface PeliculaSeriedao extends JpaRepository<PeliculaSerie, Long> {

}
