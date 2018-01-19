package leccion04;

public class Rectangulo {

	int x, y; // Posición del rectangulo (esquina superior izquierda)
	int altura, base;
	String color;
	int h, v;

	void mostrar() {
		System.out.println("El rectángulo esta en la posición (" + x + ", " + y
				+ "), tiene base " + base + ", altura " + altura + " y color "
				+ color);
	}

	int perimetro() {

		return (2 * base) + (2 * altura);
	}

	double area() {

		return base * altura;
	}

	void desplazar(int dx, int dy) {

		x = x + dx;

		y = y + dy;

	}

	boolean estaDentroDe(int h, int v) {
		
		if (h >= x && h <= (x + base) && v <= y && v >= (y - altura)) {

			return true;
		} else {
			return false;
		}
		

	}

}
