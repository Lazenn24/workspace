import java.io.*;
import java.util.*;
public class Ejemplo10Renombrar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("¿Qué archivo quieres renombrar?");
		String file = in.nextLine();
		
		String ruta = System.getProperty("user.home");
		
		File archivo = new File(ruta + "/" + file);
		String output = file.substring(0, 1).toUpperCase() + file.substring(1);
		File nuevoArchivo = new File(ruta + "/nuevo" + output);
		
		boolean cambiado = archivo.renameTo(nuevoArchivo);
		if(!cambiado) {
			System.out.println("No se ha podido cambiar el nombre del archivo.");
			
		}
	}

}
