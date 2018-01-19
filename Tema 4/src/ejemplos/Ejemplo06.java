package ejemplos;
/*
 * Ejemplo de uso de una variable global.
 */
public class Ejemplo06 {
	
	static int valores[] = { 10, 20, 30, 40, 50 };

	public static void main(String[] args) {

		System.out.println("Antes, el primer valor era " + valores[0]);
		mostrar();
		System.out.println("Después, el primer valor es " + valores[0]);

	}

	static void mostrar() {
		
		for (int i = 0; i < valores.length; i++) {
			System.out.print(valores[i] + " ");
		}
		
		valores[0] = 250;
		
	}

}

