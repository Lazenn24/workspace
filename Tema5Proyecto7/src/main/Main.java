package main;

import algebra.*;

public class Main {

	public static void main(String[] args) {
		
		Polinomio p1 = new Polinomio();
		
		System.out.println(p1.toString());
		
		Polinomio p2 = new Polinomio(5);
		
		System.out.println(p2.toString());
		
		
		double coeficientes[] = {2, 18, 10, 9};
		Polinomio p3 = new Polinomio(coeficientes);
		
		System.out.println(p3.toString());

	}

}
