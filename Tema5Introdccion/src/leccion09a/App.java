package leccion09a;

import java.util.Scanner;

public class App {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo(5, 10, 10, 20, "verde");

		System.out.println("Metodos del Rectángulo");
		System.out.println("-------------------------\n");
		r1.mostrar();
		System.out.println("El area del rectángulo es: " + r1.area());
		System.out.println("El perímetro del rectángulo es: " + r1.perimetro());
		System.out.println("-------------------------");
		System.out.println(r1.estaDentroDe(10, 16));
		System.out.println("-------------------------");
		System.out.println(r1.estaDentroDe(3, 25));
		System.out.println("-------------------------");
		System.out.println(r1.estaDentroDe(11, 35));
		System.out.println("-------------------------");
		System.out.print("Metodo mover, el rectángulo se ha desplazado: ");
		r1.desplazar(10, 10);
		r1.mostrar();

		Rectangulo r2 = new Rectangulo();
		r2.mostrar();

		Rectangulo r3 = new Rectangulo(5, 5, 200, 100, "verde");
		r3.mostrar();

		Rectangulo r4 = new Rectangulo(15, 25);
		r4.mostrar();

		r1.setX(20);
		r1.setY(30);
		r1.setBase(100);
		r1.setAltura(200);
		r1.setColor("azul");
		System.out.println("El rectangulo r1 tiene la coordenada en ("
				+ r1.getX() + ", " + r1.getY() + ") su base es " + r1.getBase()
				+ ", su altura es " + r1.getAltura() + " y su color es "
				+ r1.getColor());

	}
}
