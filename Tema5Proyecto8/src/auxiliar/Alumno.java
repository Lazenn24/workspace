package auxiliar;

import java.util.Scanner;

public class Alumno {

	private int numExpediente;

	private String nombre;

	private String apellidos;

	private Grupo grupo;

	public Alumno() {

	}

	public Alumno(int numExpediente, String apellidos, String nombre,
			Grupo grupo) {

		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}

	public String toString() {

		String resultado = numExpediente + " - " + apellidos + " - " + nombre
				+ " - " + grupo;

		return resultado;
	}

	public void leeDatos() {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Numero de expediente? ");
		numExpediente = entrada.nextInt();

		entrada.nextLine();

		System.out.print("Apellidos del alumno? ");
		apellidos = entrada.nextLine();

		System.out.print("Nombre del alumno? ");
		nombre = entrada.nextLine();

		System.out.print("Grupo: \n");
		grupo = new Grupo();
		grupo.leeDatos();

		entrada.close();
		;
	}

	// Getters y setters.

	public int getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(int numExpediente) {
		this.numExpediente = numExpediente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

}
