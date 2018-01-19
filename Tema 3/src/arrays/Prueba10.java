//Ordenar un array de 10 elementos entero.
package arrays;

public class Prueba10 {

	public static void main(String[] args) {

		int[] edades = { 20, 55, 10, 33, 90, 128, 16, 22, 26, 30 };

		int posMin;

		int aux;

		for (int i = 0; i < edades.length - 1; i++) {
			posMin = i; // La variable posMin guardará el mínimo del array entre
						// i y el final.

			// Buscamos el elemento más pequeño entre i y el final del array.
			for (int j = i + 1; j < edades.length; j++) {

				// Si encontramos un elemento más pequeño que posMin, ahora
				// posMin valdrá la nueva posición.
				if (edades[j] < edades[posMin]) {
					posMin = j;

				}

				

			}
			// Intercambiamos el elemento en posMin con el elemento en i.
			aux = edades[i];
			edades[i] = edades[posMin];
			edades[posMin] = aux;

		}

		for (int i = 0; i < edades.length; i++) {

			System.out.println(edades[i]);
		}
	}

}
