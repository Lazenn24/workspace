package ed.examen.testdoc;

import java.math.*;

import org.omg.Messaging.SyncScopeHelper;

public class Calculos {

	/**
	 * @author Sergio López
	 * @version 1.0.0
	 * @deprecated Hay una función específica de java que calcula la potencia.
	 * @param base
	 *            Es la base de la potencia.
	 * @param exponente
	 *            Es el exponente de la potencia.
	 * @return retorno Es el resultado de la potencia. Este método recibe una base y
	 *         un exponente para usarlos en una potencia y devolver su resultado.
	 */

	public int potencia(int base, int exponente) {
		Integer retorno = 1;

		for (int i = 1; i <= exponente; i++) {
			retorno = retorno * base;
		}

		return retorno;
	}

	/**
	 * @author Sergio López
	 * @version 1.0.0
	 * @param numero
	 *            Es el número que se usara en la operación de factorización.
	 * @return retorno Resultado de aplicar factorización sobre el parametro número.
	 *         Este método calculará el factorial del número que le pasemos por
	 *         parámetro.
	 */
	public int factorial (int numero) {
		int retorno = 1;
		
		if(numero < 0) {
			System.out.println("Error: " + numero + " Entrada no válida");
		}
		for (int i = 0; i <= numero; i++){
			retorno = retorno * numero;
			numero--;
			
		}
		
		return retorno;
	}

	/*
	 * public double circunferencia (double radio) { return (2 * Math.PI * radio); }
	 * 
	 * public double circulo(double radio) {
	 * 
	 * //return (Math.PI * potencia (radio,2)); return (Math.PI * radio * radio); }
	 */
	/**
	 * @author Sergio López
	 * @param base
	 *            Será la base del triángulo.
	 * @param altura
	 *            Será la altura del triángulo.
	 * @return Devuelve el area del triangulo a partir de los parámetros que le
	 *         pasemos. Este método cálcula el area de un triángulo a partir de los
	 *         métodos que le pasemos por parámetro.
	 */
	public double areaTriangulo(int base, int altura) {
		double area = 0;

		if (base < 0) {
			System.out.println("Error: " + base + " La base no puede ser un valor negativo");

		} else if (altura < 0) {
			System.out.println("Error: " + altura + " La altura no puede ser un valor negativo");
		}

		return ((base * altura) / 2);
	}
}
