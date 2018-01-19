//1.- Queremos crear una aplicaci�n que controle el acceso a un ordenador pidiendo una clave de
//acceso.
//El programa pedir� una cadena de caracteres al usuario. La comparar� con la cadena "java8"  y si
//son iguales, escribir� "Acceso permitido". En caso contrario escribir� "Acceso denegado".
package condicionales;

import java.util.*;

public class ejCondicionales1 {

	public static void main(String[] args) {
		Scanner entrada  = new Scanner (System.in);
		String respuesta;
		
		
		System.out.println("Escriba la clave de acceso: ");
		String CLAVE_REQUERIDA = entrada.nextLine();
		
		respuesta = (CLAVE_REQUERIDA.equals("java8")) ?
				"Acceso permitido"
				: "Acceso denegado";
		
	System.out.println(respuesta);
		
		

	}

}
