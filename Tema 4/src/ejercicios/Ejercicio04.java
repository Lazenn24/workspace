package ejercicios;

/*4.- Desarrolla un método que tome un array de números enteros 
 * y lo muestre ordenado.*/

public class Ejercicio04 {

	static int[] numeros = { 2, 6, 1, 8, 5, 4, 7, 11 };

	public static void main(String[] args) {

		ordenar(numeros);

	}

	static void ordenar(int numeros[]) {

		int aux = 0;

		for (int i = 0; i < numeros.length - 1; i++) {
			int posMin = i;
			for (int j = i + 1; j < numeros.length; j++) {
				if (numeros[posMin] > numeros[j]) {
					posMin = j;
				}
			}

			aux = numeros[posMin];
			numeros[posMin] = numeros[i];
			numeros[i] = aux;

		}

		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
}

