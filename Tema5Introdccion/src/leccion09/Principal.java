package leccion09;

public class Principal {

	public static void main(String[] args) {
		
		Persona p = new Persona("Pérez López", "Laura", "10200121T" );
		
//		p.apellidos = "Pérez López";
//		p.nombre = "Laura";
//		p.dni = "10200121T";
		
		p.mostrar();
	
		Persona p2 = new Persona("Martinez Valls", "Manuel", "27892567B");
		
//		p2.apellidos = "Martinez Valls"; 
//		p2.nombre = "Manuel";
//		p2.dni = "27892567B";
		
		p2.mostrar();
		
		Persona p3 = new Persona("Perez Gutierrez", "Jose", "23789023M");
		
		p3.mostrar();
		
		Persona p4 = new Persona("Martinez Ruiz", "Marcos");
		
		p4.mostrar();
		
		Persona p5 = new Persona("Domínguez Valls");
		
		p5.mostrar();
		
		// Leemos los atributos de p usando los métodos get.
		
		System.out.println("Los apellidos de p son " + p.getApellidos());
		System.out.println("El nombre de p es " + p.getNombre());
		System.out.println("El dni de p es " + p.getDni());
		
		// Modificamos los atributos de p usando los metodos set.
		
		p.setApellidos("Pérez Lópe");
		p.setNombre("Lara");
		p.setDni("89023678B");
		p.mostrar();
		
		
	}

}
