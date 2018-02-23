package ejemplo1;

public class Cliente extends Persona {

	private String visa;

	public void mostrar() {

		super.mostrar();
		System.out.println("Numero de visa: " + visa);
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}

}
