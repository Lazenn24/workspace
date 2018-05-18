import java.io.*;

public class Ejemplo06LeerTexto {
	
	private final static String NOMBRE_ARCHIVO = "ficheros/archivo1.txt";
	
	public static void main(String[] args) {
		
		
		
		FileReader archivo;
		try {
			archivo = new FileReader(NOMBRE_ARCHIVO);
			BufferedReader buffer = new BufferedReader(archivo);
			
			boolean eof = false;
			String linea;
			
			while(!eof) {
			
				linea = buffer.readLine();
				if(linea == null) {
					eof = true;
				}else {
					System.out.println(linea);
				}
			}
			
			buffer.close();
		} catch (IOException ioe) {
			// TODO Auto-generated catch block
			ioe.printStackTrace();
		}
		
		
		
	}

}
