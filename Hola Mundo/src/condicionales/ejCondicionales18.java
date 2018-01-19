//18.- Crea un programa que pida un número entero por teclado, entre 1 y 10. Si el usuario escribe un 
//número entero, se escribirá su valor en pantalla. Si lo que escribe no es un entero, se mostará un 
//mensaje de error.
package condicionales;

import java.util.*;

public class ejCondicionales18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = 0;

		System.out.println("Escribe un número entero entre el 1 y el 10:");

		if (entrada.hasNextInt() == false) {
			System.out
					.println("Tienes que escribir un número entero entre el 1 y el 10.");

		} else {
			num = entrada.nextInt();
			System.out.println("Has escrito el número " + num + ".");
		}

	}

}
