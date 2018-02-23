package electrodomesticos;

public class Taller {

	private final int MAX_LAVADORAS = 20;
	Lavadora[] lavadora;

	public Taller() {

		lavadora = new Lavadora[MAX_LAVADORAS];
	}

	public void listaLavadoras() {

		System.out.println("--- LISTADO DE LAVADORAS EN STOCK ---");

		for (int i = 0; i < MAX_LAVADORAS; i++) {
			if (lavadora[i] != null) {
				System.out.println(lavadora[i].toString());
				;
			}
		}

	}

	public void addLavadora(Lavadora lav) {

		for (int i = 0; i < MAX_LAVADORAS; i++) {
			if (lavadora[i] == null) {
				lavadora[i] = lav;
				break;
			}

		}

	}

	public int buscaLavadora(int id) {

		for (int i = 0; i < MAX_LAVADORAS; i++) {
			if (lavadora[i] != null && lavadora[i].getId() == id) {
				return i;

			}
		}
		return -1;

	}

	public void borraLavadora(int id) {

		for (int i = 0; i < MAX_LAVADORAS; i++) {

			if (lavadora[i] != null && lavadora[i].getId() == id) {
				lavadora[i] = null;
				break;
			}

		}

	}

	public Lavadora[] getLavadora() {
		return lavadora;
	}

	public void setLavadora(Lavadora[] lavadora) {
		this.lavadora = lavadora;
	}

	public int getMAX_LAVADORAS() {
		return MAX_LAVADORAS;
	}

}
