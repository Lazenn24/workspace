package bucles;

import java.util.*;

public class bucles13 {

	/*
	 * Programa que pide 5 numeros entre 0 y 10. Si el dato introducido no esta
	 * entre 0 y 10 o no es un entero, vuelve a solicitarlo.
	 */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota;
		int i = 1; // COntador de nº de pregunta.
		System.out.println("Introduza solo notas enteras entre 0 y 10.");

		while (i <= 5) {

			System.out.println("Nota " + i + ": ");
			// Comprobamos que el dato introducido es un entero
			while (entrada.hasNextInt() == false) {

				System.out.println("Nota incorrecta.");
				System.out.println("Vuelve a intentarlo:");
				entrada.next();

			}

			nota = entrada.nextInt();

			// Comprobamos que el numero esta entre el 0 y el 10
			while (nota > 10 || nota < 0) {

				System.out.println("Nota incorrecta.");
				System.out.println("Vuelva a intentarlo:");

				// Comprobamos que este dato tambien sea un entero.
				while (entrada.hasNextInt() == false) {

					System.out.println("Nota incorrecta.");
					System.out.println("Vuelve a intentarlo:");
					entrada.next();

				}
				nota = entrada.nextInt();
			}
			entrada.nextLine();

			i++;

		}

	}

}
