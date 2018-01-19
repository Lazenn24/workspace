//6.- Crea un programa que escriba todos los números pares menores de 200.
package bucles;

import java.util.*;

public class bucles9 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int i = 2;
		// while (i < 200) {
		// System.out.println(i);
		// i = i + 2;
		// }

		do {
			System.out.println(i);
			i = i + 2;
		} while (i < 200);

	}

}
