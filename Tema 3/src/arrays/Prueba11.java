// Programa que lee 6 temperaturas de cada dia durante 7 dias

package arrays;

import java.util.*;

public class Prueba11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float temps[][] = new float [2][6];
		
		System.out.println("Registros metereológicos");
		// Leemos cada fila de la tabla.
		for (int i = 0; i < temps.length; i++){
			System.out.println("Dia " + (i+1) + ": ");
			//Leemos las 6 temperaturas de cada fila.
			for (int j = 0; j < temps[0].length; j++){
				System.out.println("Temperatura " + (j+1) + ": ");
				temps[i][j] = entrada.nextFloat();
			}
			
		}
		
		//Recorremos cada fila (dia)
		for(int i = 0; i < temps.length; i++){
			
			// Mostramos los valores en cada columna
			for (int j = 0; j < temps[0].length; j++){
				System.out.print(temps[i][j] + " ");
			}
			
			System.out.println(" ");
			
		}

	}

}
