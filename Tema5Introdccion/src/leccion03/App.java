package leccion03;

import java.util.*;

public class App {
	
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		Circulo c1 = new Circulo();
		
		System.out.print("Coordenada x del círculo:");
		c1.x = in.nextInt();
		
		System.out.print("Coordenada y del círculo:");
		c1.y = in.nextInt();
		
		System.out.print("Radio del círculo:");
		c1.radio = in.nextInt();
		
		in.nextLine();
		
		System.out.print("Color del círculo:");
		c1.color = in.nextLine();
		
		c1.mostrar();
		
		System.out.println("El area del circulo es " +  c1.area());
		
		System.out.println("El perímetro del círculo es " + c1.perímetro());
		
	
		
		
	}

	
}
