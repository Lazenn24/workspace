import java.io.*;
import java.util.Scanner;

public class Ejemplo07 {
	

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String nombre;
		int puntuacion;
		String archivo;
		
		System.out.println("¿Qué nombre quieres ponerle al archivo?");
		archivo = in.nextLine();
		
		System.out.print("Escribe tu nombre:");
		nombre = in.nextLine();
		
		System.out.print("Escribe tu puntuación:");
		puntuacion = in.nextInt();
		
		
		
		try {
			FileWriter archivoNuevo = new FileWriter("ficheros/" + archivo, true);
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
