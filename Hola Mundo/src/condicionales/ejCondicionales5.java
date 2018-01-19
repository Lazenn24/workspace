//5.- Dise�a una aplicaci�n donde un usuario pueda elegir el idioma de una frase de saludo. En primer
//lugar se mostrar� un men�:
//(1) Franc�s
//(2) Ingl�s
//(3) Alem�n
//(4) Italiano
//El usuario escribir� un n�mero entero entre 1 y 4 para se�alar qu� opci�n quiere y, a continuaci�n,
//aparecer� la frase "Buenos d�as" en el idioma que corresponda (puedes usar Google translator). Si
//escribe otro n�mero, el mensaje se mostrar� en espa�ol.
package condicionales;

import java.util.*;

public class ejCondicionales5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		System.out.println(
				"�En que idioma quieres el saludo?\n1)Franc�s." + 
		"\n2)Ingl�s.\n3)Alem�n.\n4)Italiano.\nEscribe el n�mero:");
		int idioma = entrada.nextInt();
		
		switch(idioma) {
		case 1:
			System.out.println("Bonjour.");
			break;
		case 2:
			System.out.println("Good morning.");
			break;
		case 3:
			System.out.println("Guten morgen.");
			break;
		case 4:
			System.out.println("Buongiorno.");
			break;
		default:
			System.out.println("Buenos d�as.");
			break;
		}
		
		

	}

}
