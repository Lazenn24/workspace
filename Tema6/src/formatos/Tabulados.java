package formatos;

public class Tabulados {
	public static void main(String[] args) {
		
		/*
		// Ejemplos con números decimales (redondeo).
		System.out.println("\nEl número Pi con 4 cifras decimales ...");
		System.out.printf("%.4f\n", Math.PI, "Carlos");
		
		
		// Ejemplos con números enteros.
		System.out.println("\nUn número entero ocupando 6 espacios (alineado a la derecha) ...");
		System.out.printf("%6d\n", -4503);
		
		*/
		
		System.out.println("\nNúmeros enteros en los que obligamos a mostrar el signo ...");
		System.out.printf("%+d\n", 4503);
		System.out.printf("%+d\n", -4503);
		
		System.out.println("\nEl número Pi con 4 cifras decimales y ocupando 10 espacios en total ...");
		System.out.printf("%10.4f\n", Math.PI);
		
		// Ejemplos con cadenas de texto.
		System.out.println("\nCol 1 alineada a la izquierda, col 2 alineada a la derecha ...");
		System.out.printf("%-20s %10s\n", "Sogorb Valls", "Carlos");
		
		System.out.printf("%-20s %10s\n", "Román Martínez", "Beatriz");
		System.out.println("\nCol 1 alineada a la izquierda, col 2 alineada a la izquierda...");
		System.out.printf("%-20s %-10s\n", "Sogorb Valls", "Carlos");
		System.out.printf("%-20s %-10s\n", "Román Martínez", "Beatriz");
		
		System.out.println("\nCol 1 con texto alineada a la izqda, col 2 con números alineada a la derecha ...");
		System.out.printf("%-20s %10s\n", "Sogorb Valls", "340");
		System.out.printf("%-20s %10s\n", "Román Martínez", "22");
	}
}
