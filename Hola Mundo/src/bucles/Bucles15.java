/*Programa que pida un numero al usuario y lo vaya 
 * diviediendo entre -5, luego -4,  hasta llegara 5.
 * Ejemplo: Si el usuario escribe el numero 10 se mostraria:
 * 
 * 10 : -5 = -2
 * 10 : -4 = -2,5
 * 10 : -3 = -3,333333
 * 10 : -2 = -5
 * 
 * 10 : 5 = 2
 */
package bucles;

import java.util.*;

public class Bucles15 {

	public static void main(String[] args) {

		// Scanner entrada = new Scanner(System.in);
		// System.out.println("Escribe un número entero");
		// int num = entrada.nextInt();
		// int i = -5;

		// while (i <= 5) {
		// if (i != 0) { //Hay que asegurarse de que no se divida por 0.
		//   break;
		// System.out.println(num + " : " + i + " = " + num / i);

		// }
		// i++;

		// Tambien se puede poner de la sigueinte manera, como ejemplo de continue.
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un número entero:");
		int num = entrada.nextInt();
		int i = -5;

		while (i <= 5) {
			if (i == 0) { //Hay que asegurarse de que no se divida por 0.
				i++;
				continue;
			}
			System.out.println(num + " : " + i + " = " + num / i);
			i++;

		}

	}

}
