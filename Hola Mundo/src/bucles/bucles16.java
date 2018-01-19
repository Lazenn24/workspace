//Ejemplo de uso de variable semaforo.
/*Programa que solicita al usuario un numero y si este es 7, 
 *entonces le dice que ha acertado, y si no le vuelve a preguntar.
 */

package bucles;

import java.util.Scanner;

public class bucles16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		boolean adivinado = false;
		int num;

		do {

			System.out.println("Adivina el número secreto: ");
			num = entrada.nextInt();

			if (num == 7) {
				adivinado = true;
			}

		} while (adivinado == false);

		System.out.println("Felicidades");

	}

}
