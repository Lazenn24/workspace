//3.- Crea un array llamado densidades con las densidades (en g/cm3) de los nueve (sí, nueve) planetas del Sistema Solar. 
//Haz que después se muestren todos los valores mediante un bucle for.
package arrays;

public class EjercicioArrays1_03 {

	public static void main(String[] args) {
		
		String densidades[] = {"Mercurio es 5.44", "Venus es 5.24", "la Tierra es 5.52", "Marte es 3,95", 
				"Júpiter es 1.33", "Saturno es 0.69", "Urano es 1.26", "Neptuno es 1.67", "Plutón es 1.25"};
		
		for (int i = 0; i < densidades.length; i++){
			System.out.println("La densidad de "+ densidades[i] + ".");
		}
		
		

	}

}
