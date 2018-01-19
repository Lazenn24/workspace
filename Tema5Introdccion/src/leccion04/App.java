package leccion04;

import java.util.Scanner;

public class App {
	
	static Scanner in = new Scanner (System.in);
	
	public static void main(String[] args) {
		
		Rectangulo r1 = new Rectangulo();
		
		System.out.print("Coordenada x:");
		r1.x = in.nextInt();
		
		System.out.print("Coordenada y:");
		r1.y = in.nextInt();
		
		System.out.print("Base:");
		r1.base = in.nextInt();
		
		System.out.print("Altura:");
		r1.altura =in.nextInt();
		
		System.out.print("Coordenada h:");
		r1.h = in.nextInt();
		
		System.out.print("Coordenada v:");
		r1.v = in.nextInt();
		
		in.nextLine();
		
		System.out.print("Color:");
		r1.color = in.nextLine();
		
		r1.mostrar();
		r1.desplazar(20, 10);
		r1.mostrar();
		if(r1.estaDentroDe(r1.h, r1.v)){
			System.out.println("El punto (" + r1.h + ", " + r1.y + ") esta dentro del rectángulo" );
		}else{
			System.out.println("El punto (" + r1.h + ", " + r1.y + ") no esta dentro del rectángulo" );
		}
					
		System.out.println("El perímetro es " + r1.perimetro());
		System.out.println("El area es " + r1.area());
		
	}

}
