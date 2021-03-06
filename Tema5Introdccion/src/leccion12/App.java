package leccion12;

import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class App {

	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		Rectangulo r1 = new Rectangulo();

		Rectangulo r2 = new Rectangulo(5, 5, 200, 100, "verde");

		Rectangulo r3 = new Rectangulo(15, 25);

		// Todos los rectángulos tienen color negro porque la variable
		// color es estática y el último valor que se le ha dado ha sido
		// "negro" (al crear r3).
		r1.mostrar();
		r2.mostrar();
		r3.mostrar();

		System.out.println("Hay " + Rectangulo.getCantidadRectangulos()
				+ " rectángulos.");

	}
}
