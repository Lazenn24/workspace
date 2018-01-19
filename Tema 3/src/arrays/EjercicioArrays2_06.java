// 6.- Escribe una aplicación que vaya preguntando los votos de seis partidos políticos en unas 
//elecciones y guardándolos en un array. Al acabar, dirá cuál ha sido el menor número de votos y cuál
//el mayor, así como las posiciones del array que ocupan estos partidos.
package arrays;

import java.lang.reflect.Array;
import java.util.*;

public class EjercicioArrays2_06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int partidos[] = new int[6];

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < partidos.length; i++) {
			System.out
					.println("¿Cuántos votos ha tenido el partido " + i + "?");
			partidos[i] = entrada.nextInt();

			if (partidos[i] < partidos[posMin]) {
				posMin = i;
			}
			if (partidos[i] > partidos[posMax]) {
				posMax = i;
			}
		}

		System.out
				.println("El partido " + posMin
						+ " ha tenido el menor número de votos con "
						+ partidos[posMin]);
		System.out
				.println("El partido " + posMax
						+ " ha tenido el mayor número de votos con "
						+ partidos[posMax]);
		
		

	}

}
