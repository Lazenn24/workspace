package ejercicios;

import java.util.Scanner;

/*
 * 3.- Escribe un método que pida al usuario su nombre y devuelva la cadena introducida.
 */
public class Ejercicio03 {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(datos());

		in.close();
	}

	static String datos() {

		System.out.print("Nombre: ");
		String nombre = in.nextLine();

		return (nombre);

	}

}