import java.io.*;
import java.util.Scanner;

public class Ejemplo08CarpetaPersonal {

	private static String ruta;

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("¿Qué nombre quieres ponerle al archivo?");
		String file = in.nextLine();

		System.out.print("Escribe tu nombre:");
		String nombre = in.nextLine();

		System.out.print("Escribe tu puntuación:");
		int puntuacion = in.nextInt();

		ruta = System.getProperty("user.home");

		try {

			File carpetaPrograma = new File(ruta + "/Puntuaciones");
			if (!carpetaPrograma.exists()) {
				boolean resultado = carpetaPrograma.mkdir();

				if (!resultado) {
					System.out.println("No se ha podido crear la carpeta.");
					System.exit(0);
				}
				
				
			}
			FileWriter archivoNuevo = new FileWriter(carpetaPrograma + "/" + file, true);
			BufferedWriter buffer = new BufferedWriter(archivoNuevo);

			buffer.newLine();
			buffer.write(nombre);
			buffer.newLine();
			buffer.write(String.valueOf(puntuacion));

			buffer.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

}
