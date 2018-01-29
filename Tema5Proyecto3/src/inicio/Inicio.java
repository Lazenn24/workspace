/**
 * 
 */
package inicio;

import java.util.Scanner;

import biblioteca.Autor;
import biblioteca.Libro;

/**
 * @author Ramon
 */
public class Inicio {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		// Objetos de la Clase Autor
		Autor autor1 = new Autor("Patrick Rothfuss", "prothfuss@gmail.com",
				1973);
		Autor autor2 = new Autor("Dan Brown", "dbrown@gmail.com", 1964);
		Autor autor3 = new Autor("J. K. Rowling", "rowling@gmail.com", 1965);

		Autor autor4 = new Autor("Miguel de Cervantes");

		// Objetos de la clase Libro
		Libro libro1 = new Libro("El nombre del viento", "80121212", autor1);
		Libro libro2 = new Libro("Origen", "80239783", autor2);
		Libro libro3 = new Libro("Ángeles y demonios", "802323652", autor2);
		Libro libro4 = new Libro("Harry Potter y la orden del Fénix",
				"80343434", autor3);

		Libro libro5 = new Libro("Don Quijote", "80232323", autor4);

		// Incluso podríamos crear un autor en el momento de 
		// asignarlo a un libro.
		Libro libro6 = new Libro("La Comunidad del Anillo", "80323728",
				new Autor("JRR Tolkien"));
		
		System.out.println("Los datos del autor 4 son:");
		System.out.println(autor4.toString());
		
		
		// Damos de alta un autor pidiendo los datos al usuario.
		System.out.print("Nombre del autor: ");
		String nombre = entrada.nextLine();
		
		System.out.print("Email del autor: ");
		String email = entrada.nextLine();
		
		System.out.print("Año de nacimiento del autor: ");
		int fecha = entrada.nextInt();
		
		Autor autor5 = new Autor(nombre,email,fecha);
		
		System.out.print("Título del libro: ");
		entrada.nextLine();
		String titulo = entrada.nextLine();
		
		System.out.print("ISBN del libro: ");
		String isbn = entrada.nextLine();
		
		System.out.print("Año actual: ");
		int anyo = entrada.nextInt();
		
		Libro libro7 = new Libro(titulo, isbn, autor5);
		Libro.setAnyoActual(anyo);
		
		System.out.println("Datos del autor:");
		System.out.println(autor5.toString());
		
		System.out.println("Datos del libro:");
		System.out.println(libro7.toString());
		
		
		
		entrada.close();
	}

}
