package ejemplo2;

public class Furgoneta extends Automovil {
	
	private int capacidad;
	
	public Furgoneta(String marca, String matricula, String modelo, int capacidad, int plazas, int puertas){
	
	super(matricula, modelo, marca, plazas, puertas);
		
		this.capacidad = capacidad;
	}
	
	@Override
	public void mostrar(){
		
		super.mostrar();
		
		System.out.println("Volumen del maletero: " + capacidad + " litros");
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

}
