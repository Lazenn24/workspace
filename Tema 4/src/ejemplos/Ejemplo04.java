package ejemplos;
/*
 * Ejemplo de paso de parámetros por valor.
 */
public class Ejemplo04 {

	public static void main(String[] args) {

		int base = 10;
		int exponente = 3;

		System.out.println("Antes, base vale " + base);
		int potencia = elevar(base, exponente);
		System.out.println("Después, base vale " + base);
		System.out
				.println("Los tipos primitivos en Java se pasan "
						+ "siempre por valor");

	}

	static int elevar(int base, int exponente) {

		int potencia = 1;

		for (int i = 0; i < exponente; i++) {
			potencia = potencia * base;
		}

		base = 50;

		return potencia;
	}

}

