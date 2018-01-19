//13.- Modifica el programa anterior para sólo haga el proceso si el número de mes que se ha introducido está entre 1 y 4.
package condicionales;

import java.util.Scanner;

public class ejCondicionales13 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out
				.println("Introduce el número de mes que quieras (del 1 al 4); ");
		int mes = entrada.nextInt();

		if (mes == 1) {
			System.out.println("Enero");
		} else if (mes == 2) {
			System.out.println("Febrero");
		} else if (mes == 3) {
			System.out.println("Marzo");
		} else if (mes == 4) {
			System.out.println("Abril");

		} else {
			System.out
					.println("Tienes que escribir un número entre el 1 y el 4.");
		}

	}

}
