/* 4.-Escribe una aplicación que pregunte al usuario un número entre 1 y 5. 
 *Si responde "3", se le felicitará por haber acertado. Si no, se le seguirá pidiendo más números. 
 */
package bucles;

import java.util.*;

public class bucles7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		final int NUM_SECRETO = 3;

		System.out.println("Di un numero del 1 al 5:");
		int num = entrada.nextInt();

		while (num != NUM_SECRETO) {
			System.out.println("Di un numero del 1 al 5:");
			num = entrada.nextInt();

		}
		System.out.println("Felicidades, has acertado.");

	}

}
