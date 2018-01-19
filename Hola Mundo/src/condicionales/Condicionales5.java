package condicionales;
/*
 * Programa con un menu con 4 opciones y mediante un switch permite ejecutar cada opcion
 */
import java.util.Scanner;

public class Condicionales5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		System.out.println("Elige una opcion");
		System.out.println("(1) Nuevo archivo");
		System.out.println("(2) Abrir archivo");
		System.out.println("(3) Cerrar arhivo");
		System.out.println("(4) Salir");

		System.out.println("Opcion? ");
		int opcion = entrada.nextInt();

		switch (opcion) {
		case 1:
			System.out.println("Creando nuevo archivo...");
			break;
		case 2:
			System.out.println("Abriendo archivo...");
			break;
		case 3:
			System.out.println("Cerrando archivo...");
			break;
		case 4:
			System.out.println("Saliendo...");
			break;
		default:
			System.out.println("Opcion no valida.");
		}

	}

}
