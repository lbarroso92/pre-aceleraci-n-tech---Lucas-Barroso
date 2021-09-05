package com.lucasbarroso.ChallengeJava.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucasbarroso.ChallengeJava.dto.PersonajeDto;
import com.lucasbarroso.ChallengeJava.entity.Personaje;
import com.lucasbarroso.ChallengeJava.services.IPersonaje;

@RestController
@RequestMapping("/characters")
@CrossOrigin("*")
public class PersonajeController {
	@Autowired
	private IPersonaje personajeservice;
	
	@PostMapping
	public ResponseEntity<?> savepersonaje(@RequestBody PersonajeDto personajeDto){
		Personaje personaje = personajeservice.save(personajeDto);
		return new ResponseEntity<>(personaje, HttpStatus.ACCEPTED);
	}
	
	@GetMapping
	public ResponseEntity<?> findallpersonaje(){
		return new ResponseEntity<>(personajeservice.findAll(), HttpStatus.OK);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updatepersonaje(@PathVariable(value = "id") Long id, @RequestBody PersonajeDto personajeDto){
		return new ResponseEntity<>(personajeservice.update(id, personajeDto), HttpStatus.OK);
		
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deletepersonaje(@PathVariable(value = "id")Long id){
		personajeservice.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
