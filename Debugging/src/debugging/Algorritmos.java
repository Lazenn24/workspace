/**
 * 
 */
package debugging;

import static java.lang.System.*;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * @author jfparedes
 *
 */
public class Algorritmos {
	
	static Logger logger = Logger.getAnonymousLogger();

	// Debugear los siguientes algoritmos para encontrar el / los errores

	public void cuantosDigitos() {
		logger.info("Comprobamos cuantos digitos tiene un número.");
		int n, c = 0;
		// inicio
		System.out.println("Dado un numero, determinar cuantos digitos tiene");
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese numero: ");

		n = teclado.nextInt();

		logger.warning("Si la condición del loop está mal formulada, el resultado será erróneo");
		while (n > 0) {
			n = n / 10;
			c += 1;
			logger.warning("El número de digitos va por " + c);
		}

		teclado.close();

		// salida
		System.out.println("");
		System.out.println("El numero de digitos de es " + c);

	}

	public void totalMultp5() {
		// variables
		int n, i, c = 0;

		// entrada
		System.out.println("Obtiene la cantidad de los primeros N numeros multiplos de 5");
		Scanner teclado = new Scanner(System.in);
		System.out.println("");
		System.out.println("Ingrese numero: ");
		n = teclado.nextInt();

		// proceso
		i = 1;
		while (i <= n) {
			if (i % 5 == 0) {
				c += 1;
				out.println("Digito: " + i);
			}
			i++;
		}

		teclado.close();

		// salida
		System.out.println("");
		System.out.println("la cantidad de numereos multiplos de 5 es: " + c);

	}

	public void totalPares() {
		// variables
		int ini, fin, i, c = 0;

		// entrada
		System.out.println(
				"Dado un rango de numeros enteros, obtener la cantidad de numeros pares que contiene, incluidos los el inicial y el final");

		Scanner teclado = new Scanner(System.in);
		System.out.println("");

		System.out.println("Ingrese numero inicial");
		ini = teclado.nextInt();

		System.out.println("Ingrese numero final");
		fin = teclado.nextInt();

		// proceso
		i = ini;

		while (i <= fin) {
			if (i % 2 == 0) {
				c += 1;
			}
			out.println("Número par: " + i);
			i++;
		}

		teclado.close();

		// salida
		System.out.println("");
		System.out.println("La cantidad de numeros pares que se encuentra entre " + ini + " y " + fin + " es: " + c);
	}

	public void sumaNnaturales() {

		int n, i, j, s = 0;

		System.out.println("*Obtener la suma de los N numeros naturales positivos*");
		System.out.println("Ingrese número: ");
		Scanner teclado = new Scanner(System.in);
		n = teclado.nextInt();
		i = 1;
		j = n;
		
		while (i <= j) {
			s += j;
			j--;

		}

		teclado.close();

		System.out.println("la de los " + n + " numeros es " + s);
	}

}