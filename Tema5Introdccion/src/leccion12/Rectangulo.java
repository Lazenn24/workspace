package leccion12;

public class Rectangulo {

	// Atributos

	private int x, y;
	private int base, altura;

	// Como ejemplo, vamos a hacer que color sea una variable estática.
	// Eso significa que todos los rectángulos van a tener un mismo color.
	private static String color;

	// Creamos otra variable estática que contará cuántos objetos se han creado
	// de la clase Rectangulo.
	private static int cantidadRectangulos;

	// Constructores

	public Rectangulo() {
		cantidadRectangulos++;
	}

	public Rectangulo(int x, int y, int base, int altura, String color) {

		this.x = x;
		this.y = y;
		this.base = base;
		this.altura = altura;
		this.color = color;

		cantidadRectangulos++;

	}

	public Rectangulo(int x, int y) {

		this(x, y, 100, 100, "negro");

	}

	// Métodos

	public void mostrar() {
		System.out.println("Coordenadas (" + x + ", " + y + ").\nLa base es "
				+ base + ", la altura  es " + altura + " y el color es "
				+ color + ".");
	}

	public double area() {

		return base * altura;
	}

	public double perimetro() {
		return 2 * (base + altura);
	}

	public void mover(int dx, int dy) {

		x = x + dx;
		y = y + dy;

	}

	public boolean estaDentro(int x0, int y0) {

		if (x0 >= x && x0 <= (x + base) && y0 <= y && y0 >= (y - altura)) {
			return true;
		} else {
			return false;
		}

	}

	// Métodos de acceso

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

	public static int getCantidadRectangulos() {
		return cantidadRectangulos;
	}

	public static void setCantidadRectangulos(int cantidadRectangulos) {
		Rectangulo.cantidadRectangulos = cantidadRectangulos;
}
}
