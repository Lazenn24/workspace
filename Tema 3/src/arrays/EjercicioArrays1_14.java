package arrays;

public class EjercicioArrays1_14 {

	public static void main(String[] args) {

		int numPrimos = 0; // Numero de primos encontrados.
		int candidato = 2; // Candidato a ser numero primo.
		int i = 2; // Contador de numero con los que vamos dividiendo.
		boolean esPrimo = true;

		while (numPrimos < 100) {

			System.out.println("candidato = " + candidato);
			System.out.println("Comprobamos si es primo.");

			// Para cada valor de candidato, compruebo si es primo.
			i = 2;
			esPrimo = true;
			while (i < candidato) {
				if (candidato % i == 0) {
					System.out
							.println("No es primo porque se puede dividir por "
									+ i);
					esPrimo = false;
					break;
				}

				i++;
			}

			// Si candidatos es primo, lo mostramos en pantalla y aumentamos el
			// contador numPrimos.
			if (esPrimo) {
				System.out.println(candidato);
				numPrimos++;
				System.out.println("Es primo. Ya llevamos " + numPrimos
						+ " primos");
			}

			// Aumentamos candidato en 1.
			candidato++;

		}

	}
}