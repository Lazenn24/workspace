//6.- Escribe un programa que pida por consola los precios de diez productos y los guarde en un array.
//Haz que después se muestren todos los valores mediante un bucle for.
package arrays;

import java.util.*;

public class EjercicioArrays1_06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int producto[] = new int[10];

		for (int i = 0; i < producto.length; i++) {
			System.out.println("Escribe el precio del producto:");
			producto[i] = entrada.nextInt();
		}
		for (int i = 0; i < producto.length; i++) {
			System.out.println("El precio del producto " + (i + 1) + " es "
					+ producto[i] + ".");

		}
		entrada.close();

	}

}
