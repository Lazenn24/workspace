package bucles;

import java.util.*;

public class ej18CondicionalesEnBucle {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// Bucle infnito
		while (true) {

			System.out.println("Escribe el primer número:");
			double num1 = entrada.nextDouble();
			System.out.println("Escribe el segundo número:");
			double num2 = entrada.nextDouble();

			System.out.println("1) Suma");
			System.out.println("2) Resta");
			System.out.println("3) Multiplicación");
			System.out.println("4) División");
			System.out
					.println("Escribe el número de la operación que quieras realizar.");
			int oper = entrada.nextInt();

			// Ejemplo de uso de break para terminar un bucle.
			// Si el codigo de operacion es 0, terminamos el bucle.
			if (oper == 0) {
				break;
			}
			switch (oper) {
			case 1:
				System.out.println(num1 + "+" + num2 + "=" + (num1 + num2)
						+ ".");
				break;
			case 2:
				System.out.println(num1 + "-" + num2 + "=" + (num1 - num2)
						+ ".");
				break;
			case 3:
				System.out.println(num1 + "x" + num2 + "=" + (num1 * num2)
						+ ".");
				break;
			case 4:
				if (num2 == 0) {
					System.out.println("No se puede dividir entre 0.");
				} else {
					System.out.println(num1 + "/" + num2 + "=" + (num1 / num2)
							+ ".");
				}
				break;

			}
			System.out.println("Ahora seguiría el programa.");
		}

	}
}
