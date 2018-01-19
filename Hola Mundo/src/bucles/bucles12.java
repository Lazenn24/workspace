package bucles;

import java.util.*;

/* Ejemplo en que pedimos al usuario un dato continumaente 
 * hasta que le dato sea del tipo correcto.
 */

public class bucles12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe un numero entero");

		// Queremos leer un entero.
		while (entrada.hasNextInt() == false) {
			System.out.println("Dato incorrecto");
			entrada.nextInt();
		}

	}

}
