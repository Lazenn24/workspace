/*21.- Crea un programa que vaya pidiendo cinco números 
 * para mostrar sus tablas de multiplicar. Si el número introducido es 1, 
 * el programa escribirá el mensaje "¡No seas tonto!" y se volverá a formular la pregunta. 
 */
package bucles;

import java.util.*;

public class ejBucles21 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int num4 = 0;
		int num5 = 0;
		int i = 1;
		
		System.out.println("Escribe el primer número:");
		num1 = entrada.nextInt();
		System.out.println("Escribe el segundo número:");
		num2 = entrada.nextInt();
		System.out.println("Escribe el tercer número:");
		num3 = entrada.nextInt();
		System.out.println("Escribe el cuarto número:");
		num4 = entrada.nextInt();
		System.out.println("Escribe el quinto número:");
		num5 = entrada.nextInt();
		
		
		while (i < 10){
			i++;
			if (num1 != 1 || num2 != 1 || num3 != 1 || num4 != 1 || num5 != 1){
				continue;
				
			}
			System.out.println(num1 + " x " + i + " = " + (num1*i));
		}

	}

}
