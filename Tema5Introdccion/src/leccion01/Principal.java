package leccion01;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona();
		
		p.apellidos = "Pérez López";
		p.nombre = "Laura";
		p.dni = "10200121T";
		
		p.mostrar();
	
		Persona p2 = new Persona();
		
		p.apellidos = "Martinez Valls"; 
		p.nombre = "Manuel";
		p.dni = "27892567B";
		
		p.mostrar();
		
		
		
		
	}

}
