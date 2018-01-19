package bucles;

import java.util.*;

public class bucles14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		// float nota;

		// do{
		// System.out.println("Nota? ");
		// nota = entrada.nextFloat();
		// }while(nota < 0 || nota > 10);

		float nota = -1;
	

		while (nota < 0 || nota > 10) {
			System.out.println("Nota?");
			nota = entrada.nextFloat();
		}

		System.out.println("Nota correcta.");

	}

}
