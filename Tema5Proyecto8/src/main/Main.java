package main;

import instituto.*;
import auxiliar.*;

public class Main {

	public static void main(String[] args) {

		System.out.println("Añadiendo un alumno al array");

		Grupo g1 = new Grupo(101, "ESO", 4, "B");

		Alumno a2 = new Alumno(1, "Perez", "Manuel", g1);
		Alumno a3 = new Alumno(2, "Lopez", "Julian", g1);

		Instituto instituto = new Instituto();

		instituto.addAlumno(a2);
		instituto.addAlumno(a3);

		instituto.muestraAlumnos();

		System.out.println("Buscando alumno...");

		int pos = instituto.buscaAlumno(1);
		
		if (pos == -1) {
			
			System.out.println("No se ha encontrado al alumno.");
			
		} else {
			
			System.out.println("El alumno esta en la posicion " + pos);
		}
		
		System.out.println("Borrando al alumno de la posicion...");
		instituto.delAlumno(1);
		instituto.muestraAlumnos();
		
		System.out.println("Hay " + instituto.numAlumnos() + " alumno/s matriculado/s.");
		
		

	}

}
