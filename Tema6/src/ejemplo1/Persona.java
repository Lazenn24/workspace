package ejemplo1;

public class Persona {
	
	private String dni;
	private String apellidos;
	private String nombre;
	
	public void mostrar(){
		System.out.println("DNI: " + dni);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Nombre: " + nombre);
		
	}
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	

}
