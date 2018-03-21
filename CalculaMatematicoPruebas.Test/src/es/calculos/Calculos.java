package es.calculos;

public class Calculos {

	public static double division(double numerador, double denominador) {

		if (denominador == 0) {
			System.out.println("Error");

			return 0;
		}

		return numerador / denominador;

	}
	
	public double areaCiruclo(double radio) {
		
		double area = Math.PI * radio * radio;
		
		return area;
	}
	
	
}
