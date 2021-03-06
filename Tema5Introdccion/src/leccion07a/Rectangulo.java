package leccion07a;

public class Rectangulo {

	int x, y; // Posición del rectangulo (esquina superior izquierda)
	int altura, base;
	String color;
	
	
	
	// Constructores.
	
	// Crear un constructor sin parámetros (explicito).
	// Crear un constructor que tome todos los atributos de la clase.
	// Crear un constructor que tome "x" e "y" y asigne por defecto un ancho de 100, un alto de 100 y color negro.
	
	Rectangulo(){
		
	}
	
	Rectangulo(int x, int y, int altura, int base, String color){
		
		this.x = x;
		this.y = y;
		this.altura = altura;
		this.base = base;
		this.color = color;
	}
	
	Rectangulo(int x, int y){
		
		this(x, y, 100, 100, "negro");
		
	
	}
	
	
	// Métodos.

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

	boolean estaDentroDe(int x0, int y0) {

		if (x0 >= x && x0 <= (x + base) && y0 <= y && y0 >= (y - altura)) {
			return true;
		} else {
			return false;
		}

}

}
