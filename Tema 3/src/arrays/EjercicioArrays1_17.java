//17.- Escribe una aplicación que pida al usuario diez precios de productos. Después devolverá el 
//precio total a pagar y el número de productos cuyo precio sea mayor de 10 euros.
package arrays;

import java.util.*;

public class EjercicioArrays1_17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double precios[] = new double[10];
		int mayores = 0;
		double total = 0;

		for (int i = 0; i < precios.length; i++) {
			System.out.println("Introduce el precio del producto:");
			precios[i] = entrada.nextDouble();
			total = total + precios[i];
			if (precios[i] > 10) {
				mayores++;
			}
		}
		System.out.println("El precio total es " + total);
		System.out.println("Los precios mayores a 10 son " + mayores);

	}

}
