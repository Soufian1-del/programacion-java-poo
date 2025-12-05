package com.soufianAhidar.poo.redsocial;
import java.time.LocalTime;

public class Publicacion {
	//atributos
	private String publicacion;
	private LocalTime hora;
	private int likes;
	
	//constructor
	public Publicacion(String publicacion) {
		super();
		this.publicacion = publicacion;
		this.hora =  LocalTime.now();
		this.likes = likes;
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
	public LocalTime getHora() {
		return hora;
	}
	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	
}
