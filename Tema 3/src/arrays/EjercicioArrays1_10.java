//10.- Crea un programa que lea los precios de hasta cien productos y los guarde en un array llamado compra.
//Mientras los precios se van pidiendo al usuario, si éste introduce el valor 0, el programa 
//entenderá que se ha terminado la compra, y mostrará todos los precios introducidos hasta el 
//momento (no las posiciones vacías).
package arrays;

import java.util.*;

public class EjercicioArrays1_10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		float compra[] = new float[100];

		final int SALIR = 0;

		int i = 0;

		while (i < compra.length) {

			System.out.println("Producto " + i + "?");
			compra[i] = entrada.nextFloat();
			if (compra[i] == SALIR) {
				break;
			}
			i++;
		}
		i = 0;
		System.out.println("\nTemperaturas almacenadas.");
		System.out.println("===========================");
		while (i < compra.length && compra[i] != SALIR) {
			System.out.println("Producto " + i + ":" + compra[i] + ".");
			i++;
		}

	}

}
