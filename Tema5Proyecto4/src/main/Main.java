package main;

import java.util.*;

import biblioteca.Libro;
import biblioteca.Autor;

public class Main {
	
	
	/**
	 * @author Sergio
	 * @version 1.0
	 * @since 01/02/2018
	 * @param args string por defecto de la clase main
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		// Objetos de la Clase Autor
		Autor autor1 = new Autor("Patrick Rothfuss", 
				"prothfuss@gmail.com", 1973);

		// Creamos unos cuantos libros.
		Autor autores[] = new Autor[1];
		autores[0] = autor1;
		
		Libro libro1 = new Libro("El nombre del viento",
				"808289892", autores);
		
		// Nuevo libro con tres autores.
		autores = new Autor[3];
		
		Autor autor5 = new Autor("Pepe Martínez", 
				"pmartinez@gmail.com", 1980);
		autores[0] = autor5;
		
		Autor autor6 = new Autor("Manuel Sánchez",
				"msanchez@gmail.com", 1970);
		autores[1] = autor6;
		
		Autor autor7 = new Autor("Antonio Martínez",
				"amartinez@gmail.com", 1965);
		autores[2] = autor7;
		
		Libro libro2 = new Libro("Literatura 3º de ESO",
				"80121922", autores);
		
		// Vamos a mostrar los autores de estos dos libros
		System.out.println("Autores del libro 1:");
		System.out.println(libro1.muestraAutores());
		
		System.out.println("Autores del libro 2:");
		System.out.println(libro2.muestraAutores());
		
		// Probamos también el método toString().
		System.out.println("Datos del libro 1:");
		System.out.println(libro1.toString());
		
		System.out.println("Datos del libro 2:");
		System.out.println(libro2.toString());
		
		// Probamos a introducir los datos de un libro desde consola.
		Libro libro3 = new Libro();
		libro3.leeLibro();System.out.println(libro3.toString());
		
		
		
		
	}

}






