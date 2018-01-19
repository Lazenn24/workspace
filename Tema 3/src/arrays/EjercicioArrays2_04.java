//4.- Escribe un programa que pida 10 precios de productos y los guarde en un array llamado productos. 
//Después recorrerá el array hasta encontrar un precio menor que 0. Si lo encuentra escribirá el mensaje 
//"Se ha encontrado un valor no válido en la posición x. El programa terminará" 
//(x es la posición del array donde está ese dato). Si no lo encuentra, calculará la suma de todos los 
//precios y la mostrará. 
package arrays;

import java.util.*;

public class EjercicioArrays2_04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double productos[] = new double[10];

		int posMin = 0;

		double total = 0;

		for (int i = 0; i < productos.length; i++) {
			System.out.println("Introduce el precio del producto:");
			productos[i] = entrada.nextDouble();

		}

		for (int i = 0; i < productos.length; i++) {
			total = total + productos[i];
			if (productos[i] < posMin) {
				posMin = i;
				System.out
						.println("Se ha encontrado un valor no válido en la posición "
								+ posMin + ". El programa terminara");
				System.exit(0);

			}

		}

		System.out.println("Precio total: " + total);

	}
}
