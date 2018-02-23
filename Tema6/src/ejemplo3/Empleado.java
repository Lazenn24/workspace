package ejemplo3;

public class Empleado extends Persona {
	
	private int numEmpleado;
	
	public Empleado(){
		
	}
	
	public Empleado(String dni, String apellidos, String nombre, int numEmpleado){
		
		super(dni, apellidos, nombre);
		
		this.numEmpleado = numEmpleado;
	}
	
	public void darDeAlta(){
		
	}
	
	@Override
	public void mostrar(){
		
		super.mostrar();
		System.out.println("Numero de empleado: " + numEmpleado);
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}
	
	

}
