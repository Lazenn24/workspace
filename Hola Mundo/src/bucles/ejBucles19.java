/*19.- Amplía la aplicación anterior para que a medida que se van 
 * introduciendo las notas se vayan sumando (en una variable llamada suma).
 * Al final, devolverá la nota media de esas notas.
 */
package bucles;

import java.util.Scanner;

public class ejBucles19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota = 0;
		double suma = 0;
		double media;

		int i = 1; // Contador de nº de pregunta.
		System.out.println("Introduza solo notas enteras entre 0 y 10.");

		while (i <= 5) {

			System.out.println("Escribe una nota:");
			nota = entrada.nextDouble();

			while (entrada.hasNextDouble() == false) {
				System.out
						.println("Tienes que escribir una nota entre el 0 y el 10:");
				entrada.nextDouble();
			}

			// Comprobamos que el numero esta entre el 0 y el 10
			while (nota > 10 || nota < 0) {

				System.out.println("Nota incorrecta.");
				System.out.println("Vuelva a intentarlo:");
				nota = entrada.nextDouble();
				while (entrada.hasNextDouble() == false) {
					System.out
							.println("La nota tiene que ser un numero entre el 1 y el 10:");
				}

			}

			suma = suma + nota;
			i++;
		}
		media = suma / 5;
		System.out.println("La media de tus notas es: " + media);

	}
}
