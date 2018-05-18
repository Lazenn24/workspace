import java.io.*;

public class Ejemplo01 {

	public static void main(String[] args) {

		// Abrimos el archivo
		try {
			FileInputStream archivo = new FileInputStream("ficheros/archivo1.txt");

			boolean eof = false;
			int byteLeido = 0;
			int tamanyo = 0;

			while (!eof) {
				byteLeido = archivo.read();

				if (byteLeido == -1) {
					eof = true;
				} else {
					System.out.println(byteLeido + " ");
					tamanyo++;

				}

			}

			System.out.println("\nTotal bytes: " + tamanyo + " bytes");
			archivo.close();
		} catch (IOException ioe) {
			System.out.println("Error al leer el archivo");
		}

	}
}
