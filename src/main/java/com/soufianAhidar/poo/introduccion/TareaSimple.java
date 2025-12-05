package com.soufianAhidar.poo.introduccion;

public class TareaSimple {
	
	//atributos 
	private int duracion;
	private String titulo;
	private boolean completado;
	
	int duracion2;
	String titulo2;
	boolean completado2;
	
	//Constructor
	public TareaSimple(int duracion, String titulo, boolean completado, int duracion2, String titulo2,
			boolean completado2) {
		super();
		this.duracion = duracion;
		this.titulo = titulo;
		this.completado = completado;
		this.duracion2 = duracion2;
		this.titulo2 = titulo2;
		this.completado2 = completado2;
	}

	public int getDuracion2() {
		return duracion2;
	}
	
	//Metodos
	public void mostrarTarea() {
			this.cambiarEstado();
			if (completado) {
				System.out.printf("la tarea %s esta completada %n", titulo);
			} else {
				System.out.printf("la tarea %s no esta completada %n", titulo);
			}
			
		}
		public void cambiarEstado() {
			if (duracion >= 4) {
				setCompletado(false);
			} else {
				setCompletado(true);
			}
		}
		
	//setter y getters
	 public void setDuracion2(int duracion2) {
		 this.duracion2 = duracion2;
	 }

	 public String getTitulo2() {
		 return titulo2;
	 }

	 public void setTitulo2(String titulo2) {
		 this.titulo2 = titulo2;
	 }

	 public boolean isCompletado2() {
		 return completado2;
	 }

	 public void setCompletado2(boolean completado2) {
		 this.completado2 = completado2;
	 }

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public TareaSimple() {
		super();
	}

	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isCompletado() {
		return completado;
	}

	public void setCompletado(boolean completado) {
		this.completado = completado;
	}
	
	

	
}
