//12.- Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con cuatro posibles respuestas numeradas.
package bucles;

import java.util.*;

public class ejBucles12 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int nota;

		do {
			System.out
					.println("¿Quién es el autor de la novela 'Ready Player One'?");
			System.out.println("1) Douglas Capland");
			System.out.println("2) Isaac Asimov");
			System.out.println("3) Ernest Cline");
			System.out.println("4) Ray Bradbury");
			nota = entrada.nextInt();
		} while (nota < 1 || nota > 4);

		if (nota == 3) {
			System.out.println("Has acertado.");

		} else {
			System.out.println("Respuesta incorrecta.");
		}

	}

}
