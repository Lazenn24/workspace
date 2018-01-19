/*18.- Escribe una aplicación que solicite cinco notas.
 *  Si el usuario escribe una nota que no está entre 
 *  0 y 10 se le informará del error y se le volverá a pedir el dato.
 */
package bucles;

import java.util.*;

public class ejBucles18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota;
		int i = 1; // Contador de nº de pregunta.
		System.out.println("Introduza solo notas enteras entre 0 y 10.");

		while (i <= 5) {
			System.out.println("Escribe una nota:");
			nota = entrada.nextDouble();
			i++;
			// Comprobamos que el numero esta entre el 0 y el 10
			while (nota > 10 || nota < 0) {

				System.out.println("Nota incorrecta.");
				System.out.println("Vuelva a intentarlo:");

			}

		}

	}
}
