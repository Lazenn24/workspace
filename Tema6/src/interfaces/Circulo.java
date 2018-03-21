package interfaces;

public class Circulo implements Figura2D, Mostrable{
	
	private int x,y;
	private int radio;
	
	public Circulo (int x, int y, int radio) {
		
		this.x = x;
		this.y = y;
		this.radio = radio;
	}
	
	@Override
	public double area() {
		
		return Math.PI * Math.pow(radio, 2);
	}
	
	@Override
	public double perimetro() {
		
		return 2 * Math.PI * radio;
	}
	@Override
	public void mostrar() {
		
		System.out.println("Coordenadas: (" + x + ", " + y + ")");
		System.out.println();
		
		
	}

}
