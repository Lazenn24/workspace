package arrays;

public class Prueba03 {

	public static void main(String[] args) {

		// Ejemplo de mostrar los elementos de un array mediante un bucle.

		float temperaturas[] = { 20, 22, 20, 19, 17, 17, 15, 15, 16 };

		String compañeros[] = { "Alejandro", "Ramon", "Pablo", "Alejandro",
				"Ankush" };

		for (int i = 0; i < temperaturas.length; i++) {

			System.out.println("Temperaturas " + i + " = " + temperaturas[i]);

		}

		for (int j = 0; j < compañeros.length; j++) {
			System.out.println("Compañeros " + j + " = " + compañeros[j]);

		}

	}
}
