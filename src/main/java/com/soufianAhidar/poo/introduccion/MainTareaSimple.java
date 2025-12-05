package com.soufianAhidar.poo.introduccion;

public class MainTareaSimple {

	public static void main(String[] args) {
		TareaSimple objeto1 = new TareaSimple();
		objeto1.setTitulo("Nueva tarea");
		System.out.println(objeto1.getTitulo());
		
		TareaSimple objeto3 = new TareaSimple();
		objeto3.titulo2 = "Nueva tarea2";
		System.out.println(objeto3.titulo2);
		
		TareaSimple objeto2 = new TareaSimple(2, "hola", false, 2, "adios", true);
		
		objeto2.mostrarTarea();
		
		
		
	}

}
