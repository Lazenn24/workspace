package biblioteca;

public class Autor {

	// Atributos
	private String nombre;
	private String email;
	private int fechaNacimiento;

	// Constructores

	/**
	 * Constructor de Autor
	 */
	public Autor(String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}

	// Solo se introduce el parametro al que
	// no se le pone nada dentro del this
	public Autor(String nombre) {
		this(nombre, "Unknown", 0);
	}

	// Getters and Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(int fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	// ToString
	public String toString() {
		return "Nombre: " + nombre + "\nEmail: " + email
				+ "\nFecha de Nacimiento " + fechaNacimiento;
	}

}
