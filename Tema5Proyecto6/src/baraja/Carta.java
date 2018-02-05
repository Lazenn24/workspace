package baraja;

public class Carta {

	private int valor;
	private int palo;

	public Carta(int valor, int palo) {

		this.valor = valor;
		this.palo = palo;
	}

	public Carta() {

	}

	// Getters y setters,

	public int getValor() {
		return valor;

	}

	public void setValor(int valor) {
		this.valor = valor;

	}

	public int getPalo() {
		return palo;

	}

	public void setPalo(int palo) {
		this.palo = palo;

	}

	public boolean compara(Carta otraCarta) {
		if (valor == otraCarta.getValor() && palo == otraCarta.palo) {
			return true;
		} else {
			return false;
		}

	}

	public String toString() {

		String palos[] = { "diamantes", "corazones", "picas", "tréboles" };
		String valores[] = { "As", "Dos", "Tres", "Cuatro", "Cinco", "Seis",
				"Siete", "Ocho", "Nueve", "Diez", "Jota", "Reina", "Rey" };

		int posValor = valor;
		int posPalo = palo;

		String nombreCarta = valores[posValor - 1] + " de " + palos[posPalo];

		return nombreCarta;

	}

}
