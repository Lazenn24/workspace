/*10.- Trivial. Escribe una aplicación que haga una pregunta y muestre un menú con cuatro posibles respuestas numeradas.
 *Si el número introducido por el usuario no está entre uno y cuatro,
 *  se le volverá a repetir la pregunta hasta que lo esté. Finalmente se le dirá si ha acertado o fallado.
 */
package bucles;

import java.util.*;

public class ejBucles10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int NUM_CORRECTO = 1;

		System.out.println("¿Cómo se escribe 30 en hexadecimal?");
		System.out.println("1) 1E");
		System.out.println("2) 2F");
		System.out.println("3) 33");
		System.out.println("4) Ninguno de los anteriores.");

		System.out.println("Escribe el numero de la respuesta correcta:");
		int num = entrada.nextInt();

		while (num != NUM_CORRECTO) {
			System.out.println("Error. Escribe el número de la respuesta correcta:");
			num = entrada.nextInt();

		}
		System.out.println("Enhorabuena, has acertado.");
	}

}
