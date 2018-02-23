package ejemplo2;

public class Automovil extends Vehiculo {
	
	private int plazas;
	
	private int puertas;
	
	public Automovil(String matricula, String marca, String modelo, int plazas, int puertas){
		
		super(matricula, marca, modelo);
		
		this.plazas = plazas;
		this.puertas = puertas;
	}
	
	@Override
	public void mostrar(){
		
		super.mostrar();
		
		System.out.println("Numero de plazas: " + plazas + ", Número de puertas: " + puertas);
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

}
