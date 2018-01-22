package leccion10;

public class Rectangulo {

	private int x, y; // Posición del rectangulo (esquina superior izquierda)
	private int altura, base;

	// Como ejemplo, vamos a hacer que sea una variable estática.
	// Eso significa que todos los rectangulos van a tener un mismo color.
	private static String color;

	// Constructores.

	// Crear un constructor sin parámetros (explicito).
	// Crear un constructor que tome todos los atributos de la clase.
	// Crear un constructor que tome "x" e "y" y asigne por defecto un ancho de
	// 100, un alto de 100 y color negro.

	public Rectangulo() {

	}

	public Rectangulo(int x, int y, int altura, int base, String color) {

		this.x = x;
		this.y = y;
		this.altura = altura;
		this.base = base;
		this.color = color;
	}

	public Rectangulo(int x, int y) {

		this(x, y, 100, 100, "negro");

	}

	// Métodos.

	public void mostrar() {
		
		System.out.println("El rectángulo esta en la posición (" + x + ", " + y
				+ "), tiene base " + base + ", altura " + altura + " y color "
				+ color);
	}

	public int perimetro() {

		return (2 * base) + (2 * altura);
	}

	public double area() {

		return base * altura;
	}

	public void desplazar(int dx, int dy) {

		x = x + dx;

		y = y + dy;

	}

	public boolean estaDentroDe(int x0, int y0) {

		if (x0 >= x && x0 <= (x + base) && y0 <= y && y0 >= (y - altura)) {
			return true;
		} else {
			return false;
		}

	}

	public int getX() {

		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {

		return y;
	}

	public void setY(int y) {

		this.y = y;
	}

	public int getBase() {

		return base;
	}

	public void setBase(int base) {

		this.base = base;
	}

	public int getAltura() {

		return altura;
	}

	public void setAltura(int altura) {

		this.altura = altura;
	}

	public String getColor() {

		return color;
	}

	public void setColor(String color) {

		this.color = color;
	}
}
