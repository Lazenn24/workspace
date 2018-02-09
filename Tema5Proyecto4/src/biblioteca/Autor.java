package biblioteca;

/**
 * 
 *
 * @author horabaixa
 * @version 1.0
 * @since 01/02/2018
 */
public class Autor {

	// Atributos
	private String nombre;
	private String email;
	private int fechaNacimiento;

	// Constructores

	/**
	 * Constructor de Autor
	 * @param nombre nombre del autor
	 * @param email	correo del autor
	 * @param fechaNacimiento fecha de nacimiento del autor
	 */
	public Autor(String nombre, String email, int fechaNacimiento) {
		this.nombre = nombre;
		this.email = email;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	/**
	 * Constructor en caso de tan solo saber el nombre del autor
	 * @param nombre nombre del autor
	 */
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

	/**
	 * @return datos del autor
	 * @see toString .Autores
	 */
	public String toString() {
		return "Nombre: " + nombre + "\nEmail: " + email
				+ "\nFecha de Nacimiento " + fechaNacimiento;
	}

}