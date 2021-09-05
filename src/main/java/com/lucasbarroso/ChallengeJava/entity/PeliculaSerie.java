package com.lucasbarroso.ChallengeJava.entity;

import javax.persistence.*;

@Entity
@Table(name = "pelicula_serie")
public class PeliculaSerie {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column()
	private String imagen;
	@Column()
	private String titulo;
	@Column()
	private Long fecha_creacion;
	@Column()
	private Long calificacion;
	@Column()
	private Long id_personajes_asociados;

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

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Long getFecha_creacion() {
		return fecha_creacion;
	}

	public void setFecha_creacion(Long fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	public Long getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(Long calificacion) {
		this.calificacion = calificacion;
	}

	public Long getId_personajes_asociados() {
		return id_personajes_asociados;
	}

	public void setId_personajes_asociados(Long id_personajes_asociados) {
		this.id_personajes_asociados = id_personajes_asociados;
	}

}
