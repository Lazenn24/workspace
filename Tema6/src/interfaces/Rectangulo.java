package interfaces;

public class Rectangulo implements Figura2D, Mostrable{
	
	private double x,y;
	private double base, altura;
	
	public Rectangulo(double x, double y, double base, double altura) {
		
		this.x = x;
		this.y = y;
		this. base = base;
		this.altura = altura;
	}

	@Override
	public void mostrar() {
		
		System.out.println("Coordenadas: (" + x + ", " + y + ")");
		System.out.println();
		
	}

	@Override
	public double area() {
		
		return base * altura;
	}

	@Override
	public double perimetro() {
		
		return 2 * base + 2 * altura;
	}
	

	
	

}
