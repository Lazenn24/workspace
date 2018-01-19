//21.- Crea un programa que pregunte el nombre del usuario y luego lo escriba. Ahora bien, si el 
//usuario no introduce nada, el nombre deberá quedar con el valor "Desconocido".
package condicionales;

import java.util.*;

public class ejCondicionales21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String resp;
		String usuario;

		System.out.println("Introduzca su nombre de usuario: ");
		usuario = entrada.nextLine();

		resp = (usuario.trim().length() != 0) ? usuario : "Desconocido";
		System.out.println("Tu nombre de usuario es " + resp);

	}
}
