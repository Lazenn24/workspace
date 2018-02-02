package main;

import carta.Carta;

public class Main {

	public static void main(String[] args) {

		Carta carta1 = new Carta(11, 3);
		Carta carta2 = new Carta(9, 0);

		carta1.compara(carta2);
		
		System.out.println(carta1.compara(carta2));
		
		System.out.println(carta1.toString());
		System.out.println(carta2.toString());

	}
}
