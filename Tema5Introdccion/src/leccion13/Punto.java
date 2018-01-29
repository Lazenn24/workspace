package leccion13;

public class Punto {
	
	// Atributos.
	
	int x; // Coordenada x del punto (en píxeles).
	int y; // Coordenada y del punto (en píxeles).
	String color; // Color del punto.
	
	// Agregar un constructor que tome como parámetros todos los atributos.
	
	Punto(int x, int y, String color) {
		
		this.x = x;
		this.y = y;
		this.color = color;
		
	}
	
	// Métodos.
	
	void mostrar(){
		
		System.out.println("El punto tiene coordenadas (" + x + ", " + y + "), y color " + color + ".");
	}
	
	void desplazar (int dx) {
		
		x = x + dx;
		
	}
	
	// Sobrecarga de metodos: tenemos dos metodos desplazar con distinta firma
	void desplazar (int dx, int dy){
		
		x = x + dx;
		y = y + dy;
	}
	

}
