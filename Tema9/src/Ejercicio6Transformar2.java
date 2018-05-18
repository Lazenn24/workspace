import java.io.*;
import java.util.Scanner;

public class Ejercicio6Transformar2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("¿Cómo se llama el archivo?");
		String file = in.nextLine();

		boolean eof = false;
		String linea = "";
		String archivo[] = new String[100];

		try {
			File archivoOg = new File("ficheros/" + file + ".txt");

			FileReader fr = new FileReader(archivoOg);
			BufferedReader br = new BufferedReader(fr);

			for (int i = 0; i < archivo.length && !eof; i++) {
				if (linea == null) {
					eof = true;
				} else {
					linea = br.readLine();
					linea = linea.toUpperCase();
					archivo[i] = linea;
					System.out.println(archivo[i]);
				}

			}
			br.close();

		} catch (IOException ioe) {
			System.out.println("Error de E/S: " + ioe.toString());
		}
	}
}
