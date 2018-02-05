package leccion15;

/*
 * Prueba del funcionamiento del recolector de basura
 * 
 * Creamos y libereamos muchos objetos para forzarlo
 */

public class Main {
	
	public static void main(String[] args) {
		
		// Creamos un millón de objetos.
		
		for(int i = 0; i < 1000000; i++){
			
			System.out.println(i);
			
			Punto p = new Punto(5, 10, "verde");
		}
		
		
		
		

		
		
		
		
	}

}
