package leccion05;

public class Punto {
	
	// Atributos.
	
	int x; // Coordenada x del punto (en píxeles).
	int y; // Coordenada y del punto (en píxeles).
	String color; // Color del punto.
	
	// Métodos.
	
	void mostrar(){
		
		System.out.println("El punto tiene coordenadas (" + x + ", " + y + "), y color " + color + ".");
	}
	
	void desplazar (int dx){
		
		x = x + dx;
		
	}
	

}
