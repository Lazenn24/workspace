import java.io.*;

// Ejemplo para ver donde se crea una carpeta cuando se le pasa una ruta relativa
public class Ejemplo11CarpetaProyecto {

	public static void main(String[] args) {
		
		File carpeta = new File("herramientas/imagenes/configuracion/xml");
		
		boolean creada = carpeta.mkdirs();
		if (!creada) {
			System.out.println("No se han podido crear las carpetas");
		}
	}
}
