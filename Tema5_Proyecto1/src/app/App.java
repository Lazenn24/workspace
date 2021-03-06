package app;

import geometria.Cilindro;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		int altura;
		int radio;
		//
		Scanner datos = new Scanner(System.in);

		System.out.println("Introduce la altura del cilindro: ");
		altura = datos.nextInt();

		System.out.println("Introduce el radio del cilindro: ");
		radio = datos.nextInt();

		Cilindro cilindro = new Cilindro();

		cilindro.setAltura(altura);
		cilindro.setRadio(radio);

		System.out.println("El area del primer cilindro es de: "
				+ cilindro.getArea());
		System.out.println("El volumen del primer cilindro es de: "
				+ cilindro.getVolumen());
		System.out.println(cilindro.toString());

		// ///////////////////
		System.out.println();
		System.out
				.println("--------------------------------------------------");
		System.out.println();
		// ///////////////////

		System.out.println("Introduce la altura del cilindro 2: ");
		altura = datos.nextInt();

		System.out.println("Introduce el radio del cilindro 2: ");
		radio = datos.nextInt();

		Cilindro cilindro2 = new Cilindro(altura, radio);

		System.out.println("El area de este cilindro es de: "
				+ cilindro2.getArea());
		System.out.println("El volumen de este cilindro es de: "
				+ cilindro2.getVolumen());
		System.out.println(cilindro2.toString());

		datos.close();

	}

}