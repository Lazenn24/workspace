//1.- Crea un programa que guarde la siguiente tabla de edades en forma de array. A continuación 
//deberá buscar si hay alguna persona con 35 años. Si la hay, se mostrará el mensaje "Localizada 
//persona de 35 años". Utiliza una variable semáforo llamada edadEncontrada.
package arrays;

public class EjercicioArrays2_01 {

	public static void main(String[] args) {

		int edades[] = { 20, 25, 30, 28, 39, 42, 30, 29, 28, 21, 60, 55, 20, 19 };
		boolean edadEncontrada = false;

		for (int i = 0; i < edades.length; i++) {
			if (edades[i] == 35) {
				edadEncontrada = true;
				break;
			}
		}
		if(edadEncontrada == false){
			System.out.println("No hay nadie de 35 años.");
		}else{
			System.out.println("Localización persona de 35 años.");
		}

	}

}
