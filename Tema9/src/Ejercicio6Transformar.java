import java.io.*;
import java.util.Scanner;
public class Ejercicio6Transformar {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("¿Cómo se llama el archivo?");
		String file = in.nextLine();
		
		boolean eof = false;
		String linea = "";
		
		try {
			File archivoOg = new File("ficheros/" + file + ".txt");
			File archivoCop = new File("ficheros/" + file + "Temporal.txt");
			
			FileReader fr = new FileReader(archivoOg);
			BufferedReader br = new BufferedReader(fr);
			
			FileWriter fw = new FileWriter(archivoCop);
			BufferedWriter bw = new BufferedWriter(fw);
			
			while(!eof) {
				linea = br.readLine();
				if(linea == null) {
					eof = true;
				}else {
					bw.write(linea.toUpperCase());
				}
			}
			br.close();
			bw.close();
			
			boolean borrado = archivoOg.delete();
			if(borrado) {
				archivoCop.renameTo(archivoOg);
			}
			
		} catch (IOException ioe) {
			System.out.println("Error de E/S: " + ioe.toString());
		}
	}
}
