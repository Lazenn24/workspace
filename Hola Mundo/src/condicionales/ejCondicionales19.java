//19.- Modifica el programa anterior para que si además el número introducido es el 3, se informe al 
//usuario de que lo ha acertado.
package condicionales;

import java.util.Scanner;

public class ejCondicionales19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;

		System.out.println("Escribe un número entero entre el 1 y el 10:");

		if (entrada.hasNextInt() == false) {
			System.out
					.println("Tienes que escribir un número entero entre el 1 y el 10.");

		} else {
			num = entrada.nextInt();
			if (num == 3) {
				System.out.println("Has acertado número secreto.");
			} else {
				System.out.println("Has escrito el número " + num + ".");

			}
		}
	}
}
