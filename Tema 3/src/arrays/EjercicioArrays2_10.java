// 10.- Escribe un programa que pregunte las temperaturas de las últimas ocho horas y las muestre 
//ordenadas de menor a mayor, usando el método de selección. Al final también indicará la 
//temperatura menor y la mayor.
package arrays;

import java.util.*;

public class EjercicioArrays2_10 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double temperaturas[] = new double[8];

		double aux;

		int posMin;

		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println("Introduce la temperatura " + i);
			temperaturas[i] = entrada.nextDouble();
		}
		
		for (int i = 0; i < temperaturas.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < temperaturas.length; j++)
				if (temperaturas[j] < temperaturas[posMin]) {
					posMin = j;
				}

			aux = temperaturas[i];
			temperaturas[i] = temperaturas[posMin];
			temperaturas[posMin] = aux;

		}
		
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
		}
		System.out.println("La temperaturas mas baja es " + temperaturas[0]);
		System.out.println("La temperaturas mas alta es " + temperaturas[7]);

	}

}
