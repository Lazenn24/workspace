//2.- Modifica el programa anterior para que no aparezcan los múltiplos de 5 sino que, al final, 
//simplemente se muestre la suma de todos ellos. Utiliza un bucle while
package bucles;

public class ejBuclesII2 {

	public static void main(String[] args) {
		int i = 5;
		int total = 0;

		while (i < 1000) {
			i = i + 5;
			total = total + i;

		}
		System.out.println(total);

	}

}
