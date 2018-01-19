//8.- Modifica el programa anterior para que el programa pare de pedir notas si se le pasa un valor negativo.

package arrays;

import java.util.*;

public class EjercicioArrays1_08 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double notas[] = new double[10];
		
		for(int i = 0; i < notas.length; i++){
			
			System.out.println("Escribe la nota: ");
			notas[i] = entrada.nextDouble();
			if (notas[i] < 0){
				System.out.println("La nota no puede ser negativa.");
				System.exit(0);
			}
		}
		
		for(int i = 0; i < notas.length; i++){
			System.out.println("La nota " + i + " es " + notas[i] + ".");
		}

	}

}
