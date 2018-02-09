package main;

/*
 * @autor Sergio Lopez
 * Created on 6 of february of 2018
 * @since 1.0
 */

import baraja.Carta;
import baraja.Baraja;

public class Main {

	public static void main(String[] args) {

		Baraja b = new Baraja();

		b.ordenar();
		b.mostrar();
		System.out.println("-----------------------------------------");
		b.barajar();
		b.mostrar();
		System.out.println("-----------------------------------------");
		b.ordenar();
		b.cortar();
		b.mostrar();
		System.out.println("-----------------------------------------");

	}

}
