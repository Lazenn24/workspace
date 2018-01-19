//16.- Crea un programa que muestre las diez primeras potencias del número 2 (o sea, 2, 4, 8, 16, etc.).
package bucles;

public class ejBucles16 {

	public static void main(String[] args) {
		int potencia = 2;

		for (int i = 0; i <= 10; i++) {
			System.out.println(potencia);
			potencia = potencia * 2;
		}

	}

}
