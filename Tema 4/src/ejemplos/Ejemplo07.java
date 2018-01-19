package ejemplos;
import java.util.Scanner;

public class Ejemplo07 {
	
	static Scanner entrada = new Scanner(System.in);
	
	static int base;
	static int exponente;

	public static void main(String[] args) {

		System.out.print("Escribe la base: ");
		base = entrada.nextInt();

		System.out.print("Escribe el exponente: ");
		exponente = entrada.nextInt();

		elevar2();
		elevar();
		
		entrada.close();

	}

	static void elevar2() {

		System.out.println(base + " elevado al cuadrado da " + base * base);

	}

	static void elevar() {

		int potencia = 1;

		for (int i = 0; i < exponente; i++) {
			potencia = potencia * base;
		}

		System.out
				.println(base + " elevado a " + exponente + " da " + potencia);

	}

}