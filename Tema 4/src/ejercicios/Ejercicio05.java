package ejercicios;

/*5.- Modifica la actividad anterior para que el método devuelva 
 * el array ordenado*/

public class Ejercicio05 {

	static int[] numeros = { 2, 6, 1, 8, 5, 4, 7, 11 };

	public static void main(String[] args) {

		ordenar(numeros);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}

	static int[] ordenar(int valores[]) {

		int aux = 0;
		for (int i = 0; i < valores.length - 1; i++) {
			int posMin = i;
			for (int j = i + 1; j < valores.length; j++) {
				if (valores[posMin] > valores[j]) {
					posMin = j;
				}
			}
			aux = valores[posMin];
			valores[posMin] = valores[i];
			valores[i] = aux;

		}

		return valores;
	}
	
	
	
	
	
	
	
	
	
	
}