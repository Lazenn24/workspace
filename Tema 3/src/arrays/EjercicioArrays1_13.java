//13.- Crea un programa que rellene un array llamado potencias con las primeras 20 potencias de 2. 
//Haz que después se muestren todos los valores mediante un bucle while.
package arrays;

public class EjercicioArrays1_13 {

	public static void main(String[] args) {
		
		int potencias[] = new int[20];
		
		for (int i = 0; i < potencias.length; i++){
			potencias[i] = (int) Math.pow(2, i);
		}
		
		for(int i = 0; i < potencias.length; i++){
			System.out.println("Potencia " + i + " = " + potencias[i] + ".");
		}

	}

}
