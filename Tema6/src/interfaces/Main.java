package interfaces;

public class Main {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(10, 15, 100);

		Rectangulo r1 = new Rectangulo(5, 5, 100, 50);
		
		System.out.println(calcularArea(r1));
		System.out.println(calcularArea(r1));
		
		Figura2D fig1 = new Circulo(10,10, 5);
		Figura2D fig2 = new Rectangulo(5, 5, 10, 20);

		calcularArea(fig1);
		
		
	}

	public static double calcularArea(Figura2D figura) {

		return figura.area();

	}
	

}
