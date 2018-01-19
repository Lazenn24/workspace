//3.- Queremos dise�ar un programa que solicite un n�mero al usuario y le responda "Es impar" o
//"No es impar". Utiliza para ello la notaci�n ? en lugar de if asignando a una variable de tipo String
//el resultado y mostrando despu�s esta variable.
package condicionales;
import java.util.*;

public class ejCondicionales3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un número:");
		
		long num = entrada.nextLong();
		
		String resultado = ((num % 2 == 0) ? "par" : "impar");
		System.out.println("El número es " + resultado + ".");
		
		entrada.close();
		
	

	}

}
