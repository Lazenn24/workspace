package ejemplo3;

import java.util.Scanner;

public class Cliente extends Persona {

	private String visa;
	
	Cliente[] clientes;
	
	public Cliente(){
		
		clientes = new Cliente[100];
		
	}
	
	public Cliente(String dni, String apellidos, String nombre, String visa){
		
		super(dni, apellidos, nombre);
		
		this.visa = visa;
	}

	@Override
	public void mostrar() {

		super.mostrar();
		System.out.println("Numero de visa: " + visa);
	}
	
	public void saluda(){
		
		System.out.println("Hola " + nombre + " " + apellidos);
	}
	

	public void darDeAlta() {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("DNI");
		dni = in.nextLine();
		
		System.out.println("Apellidos");
		apellidos = in.nextLine();
		
		System.out.println("Nombre");
		nombre = in.nextLine();
		
		System.out.println("Visa");
		visa = in.nextLine();
		
		in.close();
		
		
		
	
		
	}

	public String getVisa() {
		return visa;
	}

	public void setVisa(String visa) {
		this.visa = visa;
	}


}
