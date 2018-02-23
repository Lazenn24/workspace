package ejemplo1;

public class Empleado extends Persona {
	
	int numEmpleado;
	
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
