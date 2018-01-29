package geometria;

public class Cilindro {

	private int altura;
	private int radio;
	private final static double PI = 3.141592;

	public Cilindro() {

	}

	public Cilindro(int altura, int radio) {
		this.altura = altura;
		this.radio = radio;
	}

	public int getAltura() {

		return getAltura();
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getRadio() {

		return getRadio();
	}

	public void setRadio(int radio) {
		this.radio = radio;
	}

	public double getArea() {
		double area = 2 * PI * radio * (radio + altura);
		return area;
	}

	public double getVolumen() {
		double volumen = PI * radio * radio * altura;
		return volumen;
	}

	public String toString() {
		String value = "Altura: " + altura + "\nRadio: " + radio;
		return value;
	}

}