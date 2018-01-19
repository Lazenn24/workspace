package arrays;

public class Prueba01 {

	public static void main(String[] args) {
		// Declarar un array de temperaturas
		
		float temperaturas[] = {20, 22, 20, 19, 17, 17, 15, 16};
		
		// Los corchetes se pueden poner justo despues del tipo
		
		float[] temperaturas2 = {20, 22, 20, 19, 17, 17, 15, 16};
		
        String compañeros[] = {"Alejandro", "Ramon", "Pablo", "Alejandro", "Ankush"};
		
		System.out.print("El array temperaturas tiene tamaño " + temperaturas.length);
		
		System.out.println("\nEl array compañeros tiene tamaño " + compañeros.length);
		
		// Mostramos los valores de algunas posiciones de estos arrays
		
		System.out.println("El primer elemento de temperaturas es " + temperaturas[0]);
		
		System.out.println("El último elemento de temperaturas es " + temperaturas[7]);
		
		System.out.println("El primer elemento de compañeros es " + compañeros[0]);
		
		System.out.println("El último elemento de compañeros es " + compañeros[4]);
	}

}
