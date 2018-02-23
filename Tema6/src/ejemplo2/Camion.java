package ejemplo2;

public class Camion extends Vehiculo{
	
	private int mma;
	private int ejes;
	
	public Camion(String matricula, String modelo, String marca, int mma, int ejes){
		
		super(matricula, modelo, marca);
		
		this.ejes = ejes;
		this.mma = mma;
		
	}
	
	public int getMma() {
		return mma;
	}

	public void setMma(int mma) {
		this.mma = mma;
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}

	@Override
	public void mostrar(){
		
		super.mostrar();
		
		System.out.println("Masa máxima autorizada: " + mma + " kg, \nNúmero de ejes: " + ejes);
	}

}
