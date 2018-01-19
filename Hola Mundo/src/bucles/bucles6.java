/* Programa que muestra las tablas de multiplicar hasta el 10
 * 
 */
package bucles;

import java.util.*;

public class bucles6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 1; // Numeor del que vamos a calcular la tabla
		int j;
		while (i <= 10) {

			// MOstramos la tabla del numero "i"
			System.out.println("Tabla del " + i + ":");
			
			j = 1;
			while (j <= 10) {

				System.out.println(i + " x " + j + " = " + i * j);
				j++;
			}
			System.out.println();
			i++;

		}
	}
}
