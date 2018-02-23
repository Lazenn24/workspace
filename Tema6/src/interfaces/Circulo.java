package interfaces;

public class Circulo implements Figura2D, Mostrable{
	
	private int x,y;
	private int radio;
	
	public double area() {
		
		return Math.PI * radio * radio;
	}
	
	public double perimetro() {
		
		return 2 * Math.PI * radio;
	}
	
	public void mostrar() {
		
		System.out.println("Coordenadas: (" + x + ", " + y + ")");
		System.out.println();
		
		
	}

}
