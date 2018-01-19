package ejemplos;

import java.util.*;

public class Ejemplo01 {

	public static void main(String[] args) {

		mayordomo();
		
		elevar();
		
		tabla();

	}

	static void mayordomo() {

		System.out.println("¿Qué se le ofrece, señor?");

	}

	static void elevar() {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un número y te lo elevo al cuadrado:");
		int num = entrada.nextInt();

		System.out.println("Tu número al cuadrado es " + num * num);

	}
	
	static void tabla(){
		
		System.out.println("Tabla del 5:");
		for (int i = 1; i <= 10; i++) {
			System.out.println("5 x " + i + " = " + 5*i);
		}
	}
	
	

}