package leccion02;

public class Main {
	
	public static void main(String[] args) {
		
		Punto punto1 = new Punto();
		punto1.x = 0;
		punto1.y = 0;
		punto1.color = "verde";
		
		// Mostramos los atributos del punto.
		punto1.mostrar();
		
		// Lo desplazamos 20 píxeles a la derecha.
		punto1.desplazar(20);
		punto1.mostrar();
		
		Punto punto2 = new Punto();
		punto2.x = 100;
		punto2.y = 50;
		punto2.color = "rojo";
		
		// Mostramos los atributos del punto.
		punto2.mostrar();
		
		// Lo desplazamos 30 píxeles a la derecha.
		punto2.desplazar(30);
		punto2.mostrar();
		
		
		
	}

}
