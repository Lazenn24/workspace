/*15.- Crea un programa que pida un número de mes entre 1 y 12.
 * A continuación devolverá el número de días de ese mes.
 * Supón que no existen años bisiestos.
 */
package condicionales;

import java.util.*;

public class ejCondicionales15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el numero de mes (1-12):");

		if (entrada.hasNextInt() == false) {
			System.out
					.println("Entrada incorrecta. Habia que escribir un numero entero entre el 1 y 12");
			System.exit(0);

		}

		int mes = entrada.nextInt();

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Este mes tiene 31 dias");
			break;
		case 2:
			System.out.println("Este mes tiene 28 dias");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Este mes tiene 30 dias");
			break;
		default:
			System.out.println("No hay ningun mes con ese numero");

		}

	}
}

