package com.soufianAhidar.poo.redsocial;
import java.time.LocalDateTime;

public class Publicacion {
	//atributos
	private String publicacion;
	private LocalDateTime hora;
	private int likes;
	
	//constructor
	public Publicacion(String publicacion) {
		super();
		this.publicacion = publicacion;
		this.hora =  LocalDateTime.now();
		this.likes = likes;
	}
	
	public Publicacion() {
		super();
	}

	//metodos
	public void mostrar() {
		System.out.printf("Tu publicacion '%s' con fecha de %d tiene un total de %d me gusta", publicacion, hora, likes);
	}
	public void	darMeGusta() {
		likes ++;
	}
	public void verMeGusta() {
		System.out.printf("tu publicacion tiene un total de %d me gusta", likes);
	}
	
	//setter y getters
	public String getPublicacion() {
		return publicacion;
	}
	
	public void setPublicacion(String publicacion) {
		this.publicacion = publicacion;
	}
	public LocalDateTime getHora() {
		return hora;
	}
	public void setHora(LocalDateTime hora) {
		this.hora = hora;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
}
