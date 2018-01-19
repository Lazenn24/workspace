//3.- Escribe un programa que lea una lista de nombres (uno a uno, hasta un máximo de 10) por consola y los vaya guardando en un array llamado nombres. 
//La aplicación terminará de pedir palabras cuando el usuario escriba "nadie".
//A continuación revisará el array y averiguará si se ha introducido el nombre "Calderón". Si es así 
//escribirá "de la Barca". Si no, escribirá "Nombre no encontrado". Utiliza una variable semáforo  llamándola nombreEncontrado.
package arrays;

import java.util.*;

public class EjercicioArrays2_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String nombres[] = new String[10];

		boolean nombreEncontrado = false;


		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Introduce un nombre:");
			nombres[i] = entrada.nextLine();
			if (nombres[i].equals("nadie")) {
				break;
			}

		}
		
		for ( int i = 0; i < nombres.length; i++){
			if (nombres[i].equals("Calderón")) {
				nombreEncontrado = true;
				break;
			}
		}
		if (nombreEncontrado) {
			System.out.println("Calderón.........de la Barca.");
		} else {
			System.out.println("Nombre no encontrado");
		}

	}
}
