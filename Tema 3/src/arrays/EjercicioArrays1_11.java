//11.- Crea un programa que almacene las órdenes que debe seguir un robot en un array de 1000 elementos. 
package arrays;

import java.util.*;

public class EjercicioArrays1_11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final String ejecutar = "ejecutar";

		String orden[] = new String[1000];

		int i = 0;

		while (i < orden.length) {
			System.out.println("Introduce una orden:");
			orden[i] = entrada.nextLine();
			if (orden[i].equals("ejecutar")) {
				break;
			}else if(!orden[i].equals("izquierda") || !orden[i].equals("derecha") || !orden[i].equals("arriba") 
				|| !orden[i].equals("abajo") || !orden[i].equals("matar")){
				System.out.println("Orden invalida");
				break;
			}
			i++;
		}
		i = 0;
		System.out.println("Órdenes almacenadas");
		System.out.println("===================");
		while (i < orden.length && !orden[i].equals("ejecutar")) {
			System.out.println("Orden " + i + ": " + orden[i] + ".");
			i++;
		}

	}

}
