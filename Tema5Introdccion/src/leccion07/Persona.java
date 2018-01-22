package leccion07;

public class Persona {

	// Atributos de la clase.

	String apellidos;
	String nombre;
	String dni;

	// Constructores.

	Persona() {

		System.out.println("Has creado un objeto Persona");

	}

	Persona(String apellidos, String nombre, String dni) {
		
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.dni = dni;
	}
	
	Persona(String apellidos, String nombre) {

		this(apellidos, nombre, "DESCONOCIDO");

//		this.apellidos = apellidos;
//		this.nombre = nombre;
//		this.dni = "DESCONOCIDO";
	}
	
	Persona(String apellidos){
		
		this(apellidos, "DESCONOCIDO", "DESCONOCIDO");
	}

	// Metodos de la clase.

	void mostrar() {

		System.out.println("Nombre: " + nombre);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("DNI: " + dni);

	}

}
