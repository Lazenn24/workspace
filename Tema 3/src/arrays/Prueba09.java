package arrays;

public class Prueba09 {

	public static void main(String[] args) {

		int[] notas = { 5, 2, 6, 7, 5, 1 };

		int posMin;

		int aux; // Tiene que ser del tipo del array.

		// Vamos recorriendo el array desde el primer elemento, hasta el
		// penúltimo(el último ya esta ordenado)

		for (int i = 0; i < notas.length - 1; i++) {
			posMin = i; // La varialbe posMin guardará el mínimo del array entre
						// i y el final.

			// Buscamos el elemento más pequeño entre i y el final del array.
			for (int j = i + 1; j < notas.length; j++) {

				// Si encontramos un elemento más pequeño que posMin, ahora
				// posMin valdrá la nueva posición.
				if (notas[j] < notas[posMin]) {
					posMin = j;

				}

			}
			// Intercambiamos el elemento en posMin con el elemento en i.
			aux = notas[i];
			notas[i] = notas[posMin];
			notas[posMin] = aux;

		}

		for (int i = 0; i < notas.length; i++) {

			System.out.println(notas[i]);
		}

	}
}
