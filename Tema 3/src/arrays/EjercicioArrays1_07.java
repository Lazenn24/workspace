//7.- Crea un array de 10 elementos de tipo double llamado notas. Ve leyendo las diez notas desde la consola, mediante un bucle 
//while, y guardándolas en el array. A continuación, muestra las diez notas.
package arrays;

import java.util.*;

public class EjercicioArrays1_07 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double notas[] = new double[10];
		
		for(int i = 0; i < notas.length; i++){
			
			System.out.println("Escribe la nota: ");
			notas[i] = entrada.nextDouble();
		}
		
		for(int i = 0; i < notas.length; i++){
			System.out.println("La nota " + i + " es " + notas[i] + ".");
		}

	}

}
