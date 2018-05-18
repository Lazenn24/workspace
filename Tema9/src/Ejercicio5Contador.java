import java.io.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio5Contador {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Nombre del fichero .java");
		String nombre = in.nextLine();

		try {
			FileReader entrada = new FileReader("ficheros/" + nombre + ".java");
			BufferedReader buffer = new BufferedReader(entrada);

			boolean eof = false;
			String linea;
			int numCases = 0;
			int numBreaks = 0;

			while (!eof) {
				linea = buffer.readLine();

				if (linea == null) {
					eof = true;
				} else {
					numCases = apariciones(linea, "case");
					numBreaks = apariciones(linea, "break");
				}

			}

			if (numBreaks < numCases) {
				System.out.println("Numero de 'break' superior a los 'case'");
			}

			System.out.println("===================");
			System.out.println("Número de break: " + numBreaks);
			System.out.println("Número de case: " + numCases);

			buffer.close();

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

	private static int apariciones(String linea, String palabra) {
		// Break
		int pos = linea.indexOf(palabra);
		int apariciones = 0;

		while (pos != -1) {
			apariciones++;
			pos = linea.indexOf(palabra, pos + 1);
		}
		return apariciones;
	}
}
