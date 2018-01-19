//15.- Crea un programa que solicite al usuario los precios de cuatro objetos y devuelva el precio total.
package bucles;

import java.util.*;

public class ejBucles15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int precioTotal = 0;

		for (int i = 1; i <= 4; i++) {
			System.out.println("Escribe el precio del producto: ");
			num = entrada.nextInt();
			precioTotal= num + precioTotal;

		}
		System.out.println("El precio total es " + precioTotal + ".");

	}
}
