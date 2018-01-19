/*Programa que muestra la tabla de multiplicar de un numero
 * indicado por el usuario.
 */
package bucles;

import java.util.Scanner;

public class bucles5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Diga de que numero quiere la tabla de multiplicar");
		int num = entrada.nextInt();
		int i = 1;

		while (i <= 10) {
			System.out.println(num + " x " + i + " = " + num * i);
			i++;
		}

	}
}
