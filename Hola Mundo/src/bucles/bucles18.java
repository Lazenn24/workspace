package bucles;

import java.util.*;

public class bucles18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Introduzca el numero del que quiera la tabla de multiplicar.");
		int num = entrada.nextInt();
		
		for(int i=1; i<=10; i++){
			System.out.println(num + " x " + i + " = " + (num*i));
		}

	}
}
