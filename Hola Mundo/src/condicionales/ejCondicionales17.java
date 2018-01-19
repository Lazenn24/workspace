//17.- Calculadora. Crea un programa que pregunte dos números al usuario. A continuación mostrará un menú.
package condicionales;

import java.util.*;

public class ejCondicionales17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
	

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

		switch (oper) {
		case 1:
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2) + ".");
			break;
		case 2:
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2) + ".");
			break;
		case 3:
			System.out.println(num1 + "x" + num2 + "=" + (num1 * num2) + ".");
			break;
		case 4:
			if (num2 == 0) {
				System.out.println("No se puede dividir entre 0.");
			} else {
				System.out.println(num1 + "/" + num2 + "=" + (num1 / num2)
						+ ".");
			}
			break;
		default:
			System.out
					.println("Tiene que introducir el número de la operacion que quieras realizar (1-4)");

		}

	}

}
