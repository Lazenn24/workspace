package baraja;

public class Baraja {

	private Carta[] cartas = new Carta[52];

	public Baraja() {

	}

	// Métodos.

	public void ordenar() {
		for (int i = 0; i < 4; i++) {
			for (int j = 1; j < 14; j++) {
				cartas[j + 13 * i - 1] = new Carta(j, i); // Ver
															// crearBaraja.txt.
															// Polinomios

			}
		}
	}

	public void barajar() {

		int num1 = 0;
		int num2 = 0;
		Carta aux;

		for (int i = 0; i < 100; i++) {
			num1 = (int) (Math.random() * 52);
			num2 = (int) (Math.random() * 52);
			aux = cartas[num1];
			cartas[num1] = cartas[num2];
			cartas[num2] = aux;
		}
	}

	public void cortar() {

		// Dejamos cortar hasta la carta en la posicion 40.
		int corte = (int) (Math.random() * 40);
		System.out.println("Número de corte: " + corte);

		Carta aux = new Carta();

		// En cada pasada de este bucle le pasamos la carta que esta arriba de
		// la baraja al fondo de la misma.
		for (int i = 0; i < corte; i++) {

			// Guardamos la carta de arriba
			aux = cartas[0];

			// Subimos cada carta una posicion.
			for (int j = 0; j < cartas.length - 1; j++) {
				cartas[j] = cartas[j + 1];
			}
			// Colocamos abajo del todo la carta que antes estaba arriba.
			cartas[cartas.length - 1] = aux;
		}

	}

	public void mostrar() {

		for (int i = 0; i < cartas.length; i++) {

			System.out.println((i + 1) + "    \t" + cartas[i]);

		}

		// Getters y setters.

	}
}
