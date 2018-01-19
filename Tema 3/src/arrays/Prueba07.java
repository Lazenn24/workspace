//Encontrar el mínimo y el máximo de una array.
package arrays;

public class Prueba07 {

	public static void main(String[] args) {

		// Vamos a enocntrar el minimo y el maximo del array

		int notas[] = { 7, 5, 10, 8, 3, 1 };

		int posMin = 0;
		
		int posMax = 0;

		for (int i = 0; i < notas.length; i++) {

			// Si el elemeneto i es mas pequeño que el de posMin, ahora posMin valdra i.
			// Lo mismo para posMax
			if (notas[i] < notas[posMin]) {
				posMin = i;
			}
			if (notas[i] > notas[posMax]) {
				posMax = i;
			}

		}
		System.out.println("La posición donde esta el mínimo es: " + posMin);
		System.out.println("EL valor mínimo es: " + notas[posMin]);
		System.out.println("La posicion donde esta el maximo es: " + posMax);
		System.out.println("El valor maximo es: " + notas[posMax]);

	}

}
