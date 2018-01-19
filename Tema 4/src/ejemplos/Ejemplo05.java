package ejemplos;
/*
 * Ejemplo de paso de parámetros por referencia.
 */
public class Ejemplo05 {

	public static void main(String[] args) {

		int valores[] = { 10, 20, 30, 40, 50 };

		System.out.println("Antes, el primer valor era " + valores[0]);
		mostrar(valores);
		System.out.println("Después, el primer valor es " + valores[0]);

	}

	static void mostrar(int numeros[]) {
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.print(numeros[i] + " ");
		}
		
		numeros[0] = 250;
		
	}

}