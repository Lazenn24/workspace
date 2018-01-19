package condicionales;
import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe tu nota: ");
		float nota = entrada.nextFloat();

		if (nota < 5) {
			System.out.println("Insuficiente");
		} else if (nota < 6) {
			System.out.println("Suficiente");
		} else if (nota < 7) {
			System.out.println("Bien");
		} else if (nota < 9) {
			System.out.println("Notable");
		} else
			System.out.println("Excelente");

	}
	// Programa que pide el numero de mes y devuelve el numero de dias de ese
	// mes. Ademas valida el dato introducido sea un numero entero.
}
