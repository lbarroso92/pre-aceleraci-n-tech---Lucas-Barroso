package com.lucasbarroso.ChallengeJava.entity;

import javax.persistence.*;

@Entity
@Table(name = "personaje")

public class Personaje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column()
	private String imagen;
	@Column()
	private String nombre;
	@Column()
	private Long edad;
	@Column()
	private Long peso;
	@Column()
	private String historia;
	@Column()
	private Long id_pelicula_serie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getEdad() {
		return edad;
	}

	public void setEdad(Long edad) {
		this.edad = edad;
	}

	public Long getPeso() {
		return peso;
	}

	public void setPeso(Long peso) {
		this.peso = peso;
	}

	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public Long getId_pelicula_serie() {
		return id_pelicula_serie;
	}

	public void setId_pelicula_serie(Long id_pelicula_serie) {
		this.id_pelicula_serie = id_pelicula_serie;
	}

}
