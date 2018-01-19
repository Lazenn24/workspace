package ejemplos;
import java.util.Scanner;

public class Ejemplo02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe la base: ");
		int base = entrada.nextInt();

		System.out.print("Escribe el exponente: ");
		int exponente = entrada.nextInt();

		elevar(base, exponente);

	}

	static void elevar2(int base) {

		System.out.println(base + " elevado al cuadrado da " + base * base);

	}

	static void elevar(int base, int exponente) {

		int potencia = 1;

		for (int i = 0; i < exponente; i++) {
			potencia = potencia * base;
		}

		System.out
				.println(base + " elevado a " + exponente + " da " + potencia);

	}

}