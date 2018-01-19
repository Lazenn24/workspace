package ejercicios;

import java.util.Scanner;

/*
 * 2.- Modifica el programa anterior para que en lugar de escribir nada en pantalla, devuelva el String 
 "Hola, nombre, no parece que tengas edad años".
 */
public class Ejercicio02 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		String nombre;
		int edad;

		System.out.println("Como te llamas?");
		nombre = in.nextLine();

		System.out.println("Cuantos años tienes?");
		edad = in.nextInt();

		System.out.println(datos(nombre, edad));

		in.close();

	}

	static String datos(String nombre, int edad) {
		String datos = "Hola, " + nombre + ", no parece que tengas " + edad
				+ " años";

		return (datos);
	}
	
	
	
	
	
	
	
	
	
	
	

}