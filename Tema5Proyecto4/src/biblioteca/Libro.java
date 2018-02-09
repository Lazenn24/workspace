package biblioteca;

import java.util.Scanner;



/**
 * @author Sergio
 * @version 1.0
 * @since 01/02/2018
 */
public class Libro {

	// Atributos
	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;
	
	Scanner in = new Scanner(System.in);
	
	/**
	 * @param titulo
	 * Constructor en caso de saber solo su nombre
	 */
	public Libro(String titulo) {
		
		this.titulo = titulo;
		
	}
	
	/**
	 * Constructor vacio, necesario para crear objetos vacios.
	 */
	public Libro(){
		
	}
	/**
	 * @param titulo titulo del libro
	 * @param isbn isbn del libro
	 * @param autores[] array de todos los objetos autor recogidos
	 */
	public Libro(String titulo, String isbn, Autor autores[]) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
		
	}
	

	// Metodo Get
	public String getTitulo() {
		return titulo;
	}

	public String getIsbn() {
		return isbn;
	}

	public Autor[] getAutores() {
		return autores;
	}

	public static int getAnyoActual() {
		return anyoActual;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAutores(Autor[] autores) {
		this.autores = autores;
	}

	public static void setAnyoActual(int anyoActual) {
		Libro.anyoActual = anyoActual;
	}
	
	/**
	 * @return Devuelve el titulo del libro con su autor si solo tiene uno, si no dice que esta escritos por varios
	 */
	public String toString() {
		
		if (autores.length > 1) {
			return titulo + " con el isbn " + isbn + " escrito por varios autores.";
		} else {
			return titulo + " con el isbn " + isbn + " escrito por " + autores[0].getNombre();
		}

	}
	
	/**
	 * @see leeAutores
	 * @return Muestra todos los autores recogidos
	 */
	public String muestraAutores(){
		
		String listaAutores="";
		
		for (int i = 0; i < autores.length; i++) {
			listaAutores = listaAutores 
					+ autores[i].getNombre() + "\n";
		}
		
		return listaAutores;
		
	}
	
	/**
	 * Este metodo sirve para leer y guardar datos de autores
	 * @see muestraAutores
	 */
	public void leeAutores(){
		
		int numAutores;
		String nombre;
		String email;
		int fechaNacimiento;
		
		System.out.print("¿Cuanto autores tiene el libro?: ");
		numAutores = in.nextInt();
		
		autores = new Autor[numAutores];
		
		for(int i = 0; i < numAutores; i++){
			
			System.out.print("Nombre del autor: ");
			nombre = in.nextLine();
			
			in.nextLine();
			
			System.out.print("Correo del autor: ");
			email = in.nextLine();
			
			System.out.print("Fecha de nacimiento del autor: ");
			fechaNacimiento = in.nextInt();
			
			Autor autor = new Autor(nombre, email, fechaNacimiento);
			autores[i] = autor;
		}
		

	}

	/**
	 * @see toString
	 */
	public void leeLibro(){
		
		System.out.println("\nIntroduce los datos del próximo libro.");
		System.out.print("Titulo: ");
		titulo = in.nextLine();
		
		System.out.print("ISBN: ");
		isbn = in.nextLine();
		
		leeAutores();
		
	}

	
	
	
	
	
	
	
	
	
	
}