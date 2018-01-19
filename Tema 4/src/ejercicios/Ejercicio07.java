package ejercicios;

import java.util.Scanner;

public class Ejercicio07 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out
				.println("Introduce un número decimal para elevarlo al cuadrado : ");
		float decimal = entrada.nextFloat();
		float total = elevarCubo(decimal);

		System.out.println(total);
	}

	static float elevarCubo(float num) {

		float resultado = num * num * num;

		return resultado;
	}

}