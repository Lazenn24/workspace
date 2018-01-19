//1.- Crea un array de Strings llamado estaciones cuyos valores sean los nombres de las cuatro 
//estaciones del año. Haz que después se muestren todos los valores mediante un bucle for.
package arrays;

public class EjercicioArrays1_01 {

	public static void main(String[] args) {

		String estaciones[] = { "Primavera", "Verano", "Otoño", "Invierno" };

		for (int i = 0; i < estaciones.length; i++) {
			System.out.println("La estación " + i + " es " + estaciones[i]
					+ ".");
		}

	}

}
