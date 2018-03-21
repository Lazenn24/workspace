package ejemplo5excepciones;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		
		try {
		
		System.out.println("Escribe un número para que divida a 20");
		String num = entrada.nextLine();
		
		int num2 = Integer.parseInt(num);
		
		
		System.out.println(num + " entre 20 es igual a " + 20 / num2);
		
		} catch (ArithmeticException ae) {
			System.out.println("No puedes dividir entre 0!");
			System.out.println("Error: " + ae.getMessage());
			
		} catch (NumberFormatException nfe) {
			System.out.println("Tienes que poner un número!");
			System.out.println("Error: " + nfe.getMessage());
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error inesperado");
			System.out.println("Error: " + e.getMessage());
			
		} finally {
			System.out.println("Esta instruccion siempre se ejecuta.");
			
		}
		
		
		
		entrada.close();
		
		
	}
}
