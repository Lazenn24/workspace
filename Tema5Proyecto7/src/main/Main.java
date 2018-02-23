package main;

import algebra.Polinomio;

public class Main {
	
	public static void main(String[] args) {
		
		Polinomio p1 = new Polinomio();
		System.out.println(p1.toString());
		
		Polinomio p2 = new Polinomio(5);
		System.out.println(p2.toString());
		
		double coeficientes[] = {2, -18, 10, 9};
		Polinomio p3 = new Polinomio(coeficientes);
		System.out.println(p3.toString());
		
		double coeficientes2[] = {1, 3, 1, 2};
		Polinomio p4 = new Polinomio(coeficientes2);
		System.out.println(p4.toString());
		
		
		System.out.println("Sumando p3 y p4...");
		System.out.println(p3.suma(p4).toString());
		
		System.out.println("Restando p3 y p4");
		System.out.println(p3.resta(p4).toString());
		
		System.out.println("Evaluando p3 para x=2...");
		System.out.println(p3.evaluar(2));
		
		
	}

}