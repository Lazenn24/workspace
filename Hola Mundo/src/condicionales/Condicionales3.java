package condicionales;
import java.util.*;

public class Condicionales3 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Valor de la compra: ");
		float compra = entrada.nextFloat();

		// Si la compra pasa de 100 euros habra descuento
		if (compra > 100) {

			boolean clienteHabitual = true;

			// Si la compra sobrepasa los 500 euros, habra un descuento
			// del 20%. Si no, el descuento sera del 10% solo.
			if (compra > 500) {
				System.out.println("Habra un 20% de descuento."
						+ "Su precio final es " + (compra - (compra * 0.2)));
				System.out.println(clienteHabitual);
			} else {
				System.out.println("Habra un 10% de descuento."
						+ " Su precio final es " + (compra - (compra * 0.1)));

			}

		} else {
			System.out.println("No hay descuento");
		}

	}

}
