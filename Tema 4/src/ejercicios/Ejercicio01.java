package ejercicios;

import java.util.Scanner;

/*
 * 1.- Escribe un método que reciba dos parámetros: el nombre de una persona y su edad. Deberá 
 mostrar por pantalla la frase "Hola, nombre, no parece que tengas edad años"
 */
public class Ejercicio01 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nombre;
		int edad;

		System.out.println("Como te llamas?");
		nombre = in.nextLine();

		System.out.println("Cuantos años tienes?");
		edad = in.nextInt();

		datos(nombre, edad);
		in.close();

	}

	static void datos(String nombre, int edad) {
		System.out.println("Hola, " + nombre + ", no parece que tengas" + edad
				+ "años");
	}

}