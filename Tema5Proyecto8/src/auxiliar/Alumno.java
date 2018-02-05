package auxiliar;

public class Alumno {
	
	private int numExpediente;
	
	private String nombre;
	
	private String apellidos;
	
	Grupo grupo;
	
	public Alumno() {
		
	}
	
	public Alumno(int numExpediente, String apellidos, String nombre, Grupo grupo) {
		
		this.numExpediente = numExpediente;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.grupo = grupo;
	}
	
	public String toString() {
		
		return null;
	}
	
	public void leeDatos(){
		
	}
	
	// Getters y setters.
	
	public int getNumExpediente(){
		
		return numExpediente;
	}
	
	public void setNumExpediente(int numExpediente){
		
		this.numExpediente = numExpediente;
		
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
	
	
	

}
