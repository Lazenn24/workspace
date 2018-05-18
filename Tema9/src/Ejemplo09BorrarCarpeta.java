import java.io.*;
import java.util.Scanner;
public class Ejemplo09BorrarCarpeta {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("¿Qué carpeta quieres borrar?");
		String nombreCarpeta = entrada.nextLine();
		
		String ruta = System.getProperty("user.home");
		File carpeta = new File(ruta + "/"+ nombreCarpeta);
		carpeta.delete();
	}

}
