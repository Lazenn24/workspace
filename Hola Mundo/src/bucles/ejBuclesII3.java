//3.- Crea una aplicación que calcule una lista con las potencias de 3 menores que 12000. Haz que en 
//cada pasada del bucle se muestre el exponente y el valor de la potencia. Utiliza un bucle do-while
package bucles;

public class ejBuclesII3 {

	public static void main(String[] args) {
		
		final int base = 3;
		int i = 0;
		
		do{
			System.out.println("3 elevado a " + i + " = " + Math.pow(base, i));
			i++;;
		}while (Math.pow(base, i ) < 12000);

	}

}
