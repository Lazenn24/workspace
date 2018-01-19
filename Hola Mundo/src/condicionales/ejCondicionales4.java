package condicionales;

import java.util.*;

public class ejCondicionales4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu nota:");
		float nota = entrada.nextFloat();

		if (nota < 4) {
			System.out.println("Rojo.");
		} else if (nota >= 4) {
			System.out.println("Verde.");
		} else if (nota >= 5) {
			System.out.println("Azul.");
		}

	}

}
