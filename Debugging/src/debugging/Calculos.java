package debugging;

public class Calculos {

	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {

			if (numero % contador == 0)

				primo = false;
			contador++;
		}
		if (primo)
			System.out.println("El número " + numero + " es primo.");
		
		return primo;
	}

	public int cuentaPrimos(int numero) {
		int total = 0;

		while (numero > 1) {
			if(esPrimo(numero))
				total++;
			numero--;
		}

		return total;
	}

}
