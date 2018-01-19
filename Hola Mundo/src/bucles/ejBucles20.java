/*20.- Concurso. El programa preguntará continuamente el número secreto 
 * (que es 6, evidentemente). En el momento en que el usuario acierte, 
 * se escribirá el mensaje "Felicidades" y terminará el programa. 
 * Si el usuario agota sus 10 posibilidades, el mensaje que verá es "Has perdido".
 */
package bucles;

import java.util.*;

public class ejBucles20 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int num = 0;
		int i = 1;

		while (i <= 10) {
			if (num == 6) {
				System.out.println("Felicidades.");
				break;
			}
			System.out
					.println("Adivinar el número secreto (tienes 10 intentos): ");
			num = entrada.nextInt();
			i++;

		}
		System.out.println("Has perdido.");

	}
}
