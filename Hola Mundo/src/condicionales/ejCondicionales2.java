//2.- Vamos a perfeccionar la aplicaci�n anterior pidiendo un nombre de usuario y una contrase�a
//para permitir el acceso al ordenador. 
package condicionales;

import java.util.*;

public class ejCondicionales2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String respuesta;
		System.out.println("Escribe tu nombre de usuario");
		String NOMBRE_REQUERIDO = entrada.nextLine();

		System.out.println("Escriba la clave de acceso: ");
		String CLAVE_REQUERIDA = entrada.nextLine();

		respuesta = (CLAVE_REQUERIDA.equals("java8") && NOMBRE_REQUERIDO.equals("Sergio")) ? 
				"Acceso permitido" 
				: "Acceso denegado";

		System.out.println(respuesta);

	}

}
