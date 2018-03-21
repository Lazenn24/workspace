package ed.examen.testdoc;

import static java.lang.System.out;

/**
 * @author Sergio López
 * @version 1.0.0
 * Este clase sirve para usar la clase cálculos, aunque también se puede usar para
 * hacer pruebas sobre esa misma clase.
 *
 */
public class Principal {

	private static Calculos calculos = new Calculos();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		out.println ("Calculo de la potencia: " + calculos.potencia(2, -3));
		out.println ("Calculo de factorial: " + calculos.factorial(5));
		out.println ("Calcula �rea triangulo: " + calculos.areaTriangulo(0, 3));

	}

}
