package com.lucasbarroso.ChallengeJava.dto;

public class PeliculaSerieDto {
	private String imagen;
	private String titulo;
	private Long fecha_creacion;
	
	public PeliculaSerieDto() {}
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
	

}
