package arrays;

import java.util.*;

public class Prueba05 {

	public static void main(String[] args) {

		// Programa que va preguntando la temperatura de una serie de dias hasta
		// que el usuario indica que ya no hay mas datos.

		Scanner entrada = new Scanner(System.in);
		
		final int SALIR = 5000;

		float temperaturas[] = new float[100];

		int i = 0;

		while (i < temperaturas.length) {

			System.out.println("Temperatura " + i + "?");
			temperaturas[i] = entrada.nextFloat();
			if (temperaturas[i] == SALIR) {
				break;
			}
			
			i++;

		}
		
		i = 0;
		System.out.println("\nTemperaturas almacenadas");
		System.out.println("==========================\n");
		while (i < temperaturas.length && temperaturas[i] != SALIR){
			System.out.println("Temperatura " + i + ": " + temperaturas[i] + ".");
			i++;
		}
		
	}
	
	
	

}
