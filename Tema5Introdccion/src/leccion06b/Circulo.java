package leccion06b;

public class Circulo {

	int x, y; // Coordenadas del centro en píxeles.
	int radio; // Radio del círculo.
	String color; // Color del círculo
	
	// Agregar un constructor que tome como parametros todos los atributos.
	
	Circulo(int x, int y, int radio, String color){
		
		this.x = x;
		this.y = y;
		this.radio = radio;
		this.color = color;
	}
	
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
