package algebra;

public class Polinomio {

	private double coeficientes[];

	public Polinomio() {
		coeficientes = new double[3];
	}

	public Polinomio(int grado) {
		coeficientes = new double[grado + 1];
	}

	public Polinomio(double coefs[]) {
		coeficientes = coefs;
	}

	public String toString() {
		String salida = "" + coeficientes[0];

		for (int i = 1; i < coeficientes.length; i++) {
			if (coeficientes[i] >= 0) {
				salida = salida + " + " + coeficientes[i] + "x^" + i;
			} else {
				salida = salida + " - " + (-coeficientes[i]) + "x^" + i;
			}
		}

		return salida;
	}

	public Polinomio suma(Polinomio p) {

		int longMax = Math.max(coeficientes.length, p.coeficientes.length);
		int longMin = Math.min(coeficientes.length, p.coeficientes.length);
		double[] coefSuma = new double[longMax];

		for (int i = 0; i < longMin; i++) {
			coefSuma[i] = coeficientes[i] + p.coeficientes[i];
		}

		for (int i = longMin; i < longMax; i++) {
			if (coeficientes.length > p.coeficientes.length) {
				coefSuma[i] = coeficientes[i];
			} else {
				coefSuma[i] = p.coeficientes[i];
			}

		}

		Polinomio suma = new Polinomio(coefSuma);
		return suma;
	}

	public Polinomio resta(Polinomio p) {

		for (int i = 0; i < p.coeficientes.length; i++) {
			p.coeficientes[i] = -1 * p.coeficientes[i];

		}
		return suma(p);
	}

	public double evaluar(double x) {

		double total = 0;

		for (int i = 0; i < coeficientes.length; i++) {
			total = total + coeficientes[i] * Math.pow(x, i);

		}
		return total;
	}
}
