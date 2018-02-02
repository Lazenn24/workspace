package biblioteca;

import java.util.Scanner;


public class Libro {

	// Atributos
	private String titulo;
	private String isbn;
	private Autor[] autores;
	private static int anyoActual;
	
	Scanner in = new Scanner(System.in);
	
	

	// Constructores
	public Libro(String titulo) {
		
		this.titulo = titulo;
		
	}

	public Libro(String titulo, String isbn, Autor autores[]) {
		
		this.titulo = titulo;
		this.isbn = isbn;
		this.autores = autores;
		
	}
	
	public Libro(){
	
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

	// Metodo toString
	public String toString() {
		
		if (autores.length > 1) {
			return titulo + " con el isbn " + isbn + " escrito por varios autores.";
		} else {
			return titulo + " con el isbn " + isbn + " escrito por " + autores[0].getNombre();
		}

	}
	
	public String muestraAutores(){
		
		String listaAutores="";
		
		for (int i = 0; i < autores.length; i++) {
			listaAutores = listaAutores 
					+ autores[i].getNombre() + "\n";
		}
		
		return listaAutores;
		
	}
	
	// Este metodo lee una serie de autores que se guardaran en el atributo autores.
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
	
	public void leeLibro(){
		
		System.out.println("\nIntroduce los datos del próximo libro.");
		System.out.print("Titulo: ");
		titulo = in.nextLine();
		
		System.out.print("ISBN: ");
		isbn = in.nextLine();
		
		leeAutores();
		
	}

	
	
	
	
	
	
	
	
	
	
}