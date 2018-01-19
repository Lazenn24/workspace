package ejercicios;

import java.util.Scanner;

/*
 * 6.- Crea un método que tome un número decimal y devuelva su cuadrado
 */

public class Ejercicio06 {

	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out
				.println("Introduce un número decimal para elevarlo al cuadrado : ");
		float decimal = entrada.nextFloat();
		float total = elevarCuadrado(decimal);

		System.out.println(total);
	}

	static float elevarCuadrado(float num) {

		float resultado = num * num;

		return resultado;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}