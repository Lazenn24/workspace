// 9.- Crea un programa que muestre los siguientes precios (guardados en un array llamado precios) ordenados de menor a mayor, usando el método de selección
package arrays;

public class EjercicioArrays2_09 {

	public static void main(String[] args) {

		int precios[] = { 43, 58, 44, 62, 80, 15, 15, 10, 90, 56 };

		int posMin;

		int aux;

		for (int i = 0; i < precios.length - 1; i++) {
			posMin = i;
			for (int j = i + 1; j < precios.length; j++) {
				if (precios[j] < precios[posMin]) {
					posMin = j;

				}

			}
			aux = precios[i];
			precios[i] = precios[posMin];
			precios[posMin] = aux;

		}
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i]);
		}

	}
}
