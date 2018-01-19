/*5.- Escribe un programa que solicite un número al usuario y,
 *  a continuación, muestre la tabla de multiplicar de ese número.
 */
package bucles;

import java.util.*;

public class bucles8 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int i = 1;

		System.out.println("Escribe el numero del que quieras la tabla");
		int num = entrada.nextInt();

		while (i <= 10) {
			System.out.println(num + " x " + i + " = " + num * i);
			i++;
		}

	}

}
