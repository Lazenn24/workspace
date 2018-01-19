/*20.- Escribe un programa que pida la edad del usuario. Si ésta es menor de 18 años, 
 * el valor de la variable mayorDeEdad será verdadero. Si no, será falso. Al final se mostrará este valor.
 */
package condicionales;

import java.util.*;

public class ejCondicionales20 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int edad;
		boolean mayorDeEdad = false;

		System.out.println("Introduce tu edad:");
		edad = entrada.nextInt();

		if (edad < 18) {
			mayorDeEdad = true;
		} else if (edad >= 18) {
			mayorDeEdad = false;
		}
		System.out.println(mayorDeEdad);

	}

}
