package ejemplo3;

public abstract class Persona {
	
	protected String dni;
	protected String apellidos;
	protected String nombre;
	
	public Persona(){
		
	}
	
	public Persona(String dni, String apellidos, String nombre){
	
		this.dni = dni;
		this.apellidos = apellidos;
		this.nombre = nombre;
	}
	
	public void mostrar(){
		System.out.println("DNI: " + dni);
		System.out.println("Apellidos: " + apellidos);
		System.out.println("Nombre: " + nombre);
		
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		
//		if(this == obj) {
//			return true;
//		}else if(obj == null) {
//			return false;
//		}else if(obj instanceof Persona) {
//			return dni.equals(((Persona) obj).dni);
//		}else {
//			return false;
//		}
//	}
	
	public abstract void darDeAlta();
	
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
