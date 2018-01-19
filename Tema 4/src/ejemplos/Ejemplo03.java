package ejemplos;
import java.util.Scanner;

public class Ejemplo03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Escribe la base: ");
		int base = entrada.nextInt();

		System.out.print("Escribe el exponente: ");
		int exponente = entrada.nextInt();

		System.out.println(base + " elevado al cuadrado da " + elevar2(base));

		System.out.println(base + " elevado a " + exponente + " da "
				+ elevar(base, exponente));

		System.out.println(base + " elevado al cubo da " + elevar3(base));

		String nombre = leerNombre();

	}

	static int elevar2(int base) {

		int resultado = base * base;

		return resultado;

	}

	static int elevar(int base, int exponente) {

		int potencia = 1;

		for (int i = 0; i < exponente; i++) {
			potencia = potencia * base;
		}

		return potencia;
	}

	static int elevar3(int base) {

		int potencia;

		potencia = base * base * base;

		return potencia;

	}

	static String leerNombre() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("\nEscribe tu nombre: ");
		String nombre = entrada.nextLine();

		return nombre;

	}

}