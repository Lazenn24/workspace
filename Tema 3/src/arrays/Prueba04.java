package arrays;

import java.util.*;

public class Prueba04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		// Declaramos un array de String con 5 posicones.
		String nombres[] = new String[5];
		
		// Le vamos recorriendo y rellenando cada posicion con un nombre escrito por el usuario.
		for (int i = 0; i < nombres.length; i++){
			System.out.println("Nombre " + i + ": ");
			nombres[i] = entrada.nextLine();
		}
		
		//Como comprobación, recorremos otra vez el array mostrando en pantalla cada posición.
		for ( int i = 0; i < nombres.length; i++)
			System.out.println("El nombre " + i + " es " + nombres[i]);
		
		

	}

}
