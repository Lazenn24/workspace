//4.- Utiliza un bucle for para preguntar 5 veces por un número entero, y al final devolver la frase "Has fallado".
package bucles;

import java.util.*;

public class ejBuclesII4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 1; i <= 5; i++) {
			System.out.println("Adivina el número secreto:");
			entrada.nextInt();

		}
		System.out.println("Has fallado.");

	}

}
