//5.- Escribe un programa que guarde las siguientes temperaturas en un array y busque su máximo y 
//mínimo. Además deberá indicar en qué posición del array están ese máximo y mínimo.
package arrays;

public class EjercicioArrays2_05 {

	public static void main(String[] args) {

		int posMin = 0;
		int posMax = 0;

		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5,
				10, 10.1, 9.8, 9, 6 };

		for (int i = 0; i < temperaturas.length; i++) {
			if (temperaturas[i] < temperaturas[posMin]) {
				posMin = i;
			}
			if (temperaturas[i] > temperaturas[posMax]) {
				posMax = i;

			}
		}
		System.out.println("La posición del mínimo es la " + posMin
				+ " y la del máximo es " + posMax);
		System.out.println("El valor mínimo es " + temperaturas[posMin]
				+ " y el máximo es " + temperaturas[posMax]);

	}
}
