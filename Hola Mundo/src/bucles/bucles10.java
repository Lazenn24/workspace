//7.- Crea un programa que escriba los 50 primeros números pares. 
package bucles;

public class bucles10 {

	public static void main(String[] args) {

		int par = 2; // Almacena los numeros pares que se van calculando
		int i = 1; // Contador

		// while (i <= 50) {
		// System.out.println(par);
		// par = par + 2;
		// i++;
		// }

		do {
			System.out.println(par);
			par = par + 2;
			i++;
		} while (i <= 50);

	}
}
