// 12.- La siguiente tabla muestra los números atómicos de los elementos que forman una muestra de 
// un material desconocido. Escribe un programa que los muestre ordenados de menor a mayor. Al 
// final también indicará el número atómico menor y el mayor.
package arrays;

public class EjercicioArrays2_12 {

	public static void main(String[] args) {
		
		int pesos[] = { 8, 2, 10, 20, 12, 71, 15, 23};
		
		
		int aux;
		
		int posMin;
		
		for (int i = 0; i < pesos.length; i++){
			posMin = i;
			
			for( int j = i + 1; j < pesos.length; j++){
				
				if (pesos[j] < pesos[posMin]){
					posMin = j;
				}
			}
			aux = pesos[i];
			pesos[i] = pesos[posMin];
			pesos[posMin] = aux;
			
		}
		
		for (int i = 0; i < pesos.length; i++){
			System.out.println("Peso " + (i + 1) + ": " + pesos[i]);
		}
		
		System.out.println("El peso mas bajo es " + pesos[0]);
		System.out.println("EL peso mas alto es " + pesos[7]);

	}
}
