//5.- Diseña un programa que invente un número aleatorio. A continuación pedirá al usuario que lo 
//adivine. Si el usuario falla, entonces el programa le dará otra oportunidad. Una vez que el usuario 
//adivina el número o falla tres veces, el programa termina. 
package bucles;

import java.util.*;

public class ejBuclesII5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int numSec = (int) (Math.random() * 10 + 1);
		int i = 1;
		int num;

		do {
			System.out.println("Escribe el número secreto:");
			num = entrada.nextInt();
			i++;
			if (num == numSec) {
				System.out.println("Has acertado.");
				break;
			} else {
				System.out.println("Has fallado.");
				System.out.println("Te quedan " + (4 - i) + " intentos.");
			}
		} while (i <= 3);
		if (!(num == numSec)) {
			System.out.println("El número secreto era: " + numSec + ".");
		}

		entrada.close();

	}
}
