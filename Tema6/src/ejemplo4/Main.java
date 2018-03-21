package ejemplo4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Escribe el nº del dia de la semana: ");
		int dia = in.nextInt();
		
		switch(dia) {
		case DiasSemana.LUNES:
			System.out.println("LUNES");
			break;
		case DiasSemana.MARTES:
			System.out.println("MARTES");
			break;
		case DiasSemana.MIERCOLES:
			System.out.println("MIERCOLES");
			break;
		case DiasSemana.JUEVES:
			System.out.println("JUEVES");
			break;
		case DiasSemana.VIERNES:
			System.out.println("VIERNES");
			break;
		case DiasSemana.SABADO:
			System.out.println("SABADO");
			break;
		case DiasSemana.DOMINGO:	
			System.out.println("DOMINGO");
			break;
		}
		
		
		
		
		
		in.close();
	

	}

}
