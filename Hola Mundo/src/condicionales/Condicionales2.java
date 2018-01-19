package condicionales;
/*
 * * Programa que pida el nombre del mes (entre enero y junio) y devuelve
 * el numero de dias de ese mes
 */
import java.util.Scanner;

public class Condicionales2 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el mes ");
		String mes = entrada.nextLine();

		mes = mes.toLowerCase();

		if (mes.equals("enero")) {
			System.out.println("El mes de enero tiene 31 dias");
		} else if (mes.equals("feberero")) {
			System.out.println("El mes de febrero tiene 28");
		} else if (mes.equals("marzo")) {
			System.out.println("El mes de marzo tiene 31 dias");
		} else if (mes.equals("abril")) {
			System.out.println("El mes de abril tiene 30 dias");
		} else if (mes.equals("mayo")) {
			System.out.println("El mes de mayo tiene 31 dias");
		} else if (mes.equals("junio")) {
			System.out.println("El mes de junio tiene 30 dias");
		} else {
			System.out.println("Nombre de mes equivocado");
		}

	}

}
