package leccion10a;

public class Main {

	public static void main(String[] args) {

		Persona p = new Persona("Pérez López", "Laura", "10200121T");
		p.mostrar();

		Persona p2 = new Persona("Martínez Valls", "Manuel", "27635232H");
		p2.mostrar();

		Persona p3 = new Persona("Pérez", "María", "11029102Y");
		p3.mostrar();

		Persona p4 = new Persona("Martínez Ruiz", "Marcos");
		p4.mostrar();

		Persona p5 = new Persona("Domínguez Valls");
		p5.mostrar();

		// Leemos los atributos de p usando los métodos get.
		System.out.println("\nLos apellidos de p son " + p.getApellidos());
		System.out.println("El nombre de p es " + p.getNombre());
		System.out.println("El DNI de p es " + p.getDni());

		// Modificamos los atributos de p usando los métodos set.
		p.setApellidos("Pérez Lope");
		p.setNombre("Lara");
		p.setDni("10200121H");
		p.mostrar();

		System.out.println("\n" + Persona.getNumPersonas()
				+ " personas se han creado.");

	}

}
