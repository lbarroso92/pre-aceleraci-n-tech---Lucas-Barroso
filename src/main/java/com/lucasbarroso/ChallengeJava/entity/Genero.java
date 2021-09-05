package com.lucasbarroso.ChallengeJava.entity;

import javax.persistence.*;

import lombok.Data;
@Data
@Entity
@Table(name = "pelicula_serie")
public class Genero {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column()
	private String nombre;
	@Column()
	private String imagen;

	@Column()
	private Long id_pelicula_serie;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Long getId_pelicula_serie() {
		return id_pelicula_serie;
	}

	public void setId_pelicula_serie(Long id_pelicula_serie) {
		this.id_pelicula_serie = id_pelicula_serie;
	}
	

}
