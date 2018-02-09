package algebra;

public class Polinomio {

	private double coeficientes[];

	public Polinomio() {
		coeficientes = new double[3];
	}

	public Polinomio(int grado) {
		coeficientes = new double[grado + 1];
	}
	
	public Polinomio(double coefs[]){
		coeficientes = coefs;	
	}

	public double[] getCoeficientes() {
		return coeficientes;
	}
	
	public String toString() {
		String salida = "" + coeficientes[0];
		
		for (int i = 1; i < coeficientes.length; i++) {
			
			salida = salida + " + " + coeficientes[i] +  "x^" + i;
					
		}
		
		return salida;
	}

	public void setCoeficientes(double coeficientes[]) {
		this.coeficientes = coeficientes;
	}

}
