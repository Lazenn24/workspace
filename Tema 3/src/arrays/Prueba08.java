// Encuentra el minimo y el maximo del siguiente array.
package arrays;

public class Prueba08 {

	public static void main(String[] args) {
		
		double pesos[] = {70.4, 76.5, 80, 67, 71, 73};
		
		int posMin = 0;
		int posMax = 0;
		
		for (int i = 0; i < pesos.length; i++){
			if (pesos[i] < pesos[posMin]){
				posMin = i;
			}
			if( pesos[i] > pesos[posMax]){
				posMax = i;
			}
		}
		System.out.println("La posición donde esta el mínimo es la " + posMin + " y el máximo en " + posMax);
		System.out.println("El valor mínimo es " + pesos[posMin] + " y el valor maximo es " + pesos[posMax]);

	}

}
