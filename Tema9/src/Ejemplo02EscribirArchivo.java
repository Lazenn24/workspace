import java.io.*;

public class Ejemplo02EscribirArchivo {

	public static void main(String[] args) {

		try {

			// Abrimos el archivo de entrada.
			FileInputStream entrada = new FileInputStream("ficheros/lenovo.png");

			// Abrimos el archivo de salida (la copia)
			FileOutputStream salida = new FileOutputStream("ficheros/lenovo_copia.png");

			// Vamos leyendo un caracter del archivo original y guardandolo en la copia
			boolean eof = false;
			int byteLeido = 0;
			
			System.out.println("Copiando archivo...");
			while (!eof) {
				byteLeido = entrada.read();
				if(byteLeido == -1) {
					eof = true;
				}else {
					salida.write(byteLeido);
				}
				
			}
			System.out.println("Archivo guardado.");
			
			entrada.close();
			salida.close();
		} catch (IOException ioe) {
			System.out.println("Error de entrada/salida." + ioe.getMessage());
		}
	}

}
