package leccion03;

public class Circulo {

	int x, y; // Coordenadas del centro en píxeles.
	int radio; // Radio del círculo.
	String color; // Color del círculo
	
	// Métodos
	
	void mostrar(){
		
		System.out.println("El centro del círculo esta en las coordenadas (" + x + ", " + y + "), tiene un radio de " + radio + " píxeles y es de color " + color);
	}
	
	double area(){
		
		return Math.PI * radio * radio;
		
	}
	
	double perímetro(){
		
		return 2 * Math.PI * radio;
	}
	
}
