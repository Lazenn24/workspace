/*11.- Escribe un programa que pregunte un número entre 1 y 20. Si el número introducido no cumple la condición, 
 * se le volverá a preguntar hasta que la cumpla. Al final simplemente se mostrará el número en pantalla.
 */
package bucles;
import java.util.Scanner;


public class ejBucles11 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		float nota;
		
		do{
			System.out.println("Nota entre 1 y 20? ");
			nota = entrada.nextFloat();
		}while(nota < 1 || nota > 20);
		
		System.out.println("Has introducido la nota " + nota);

	}

}
