//22.- Escribe un programa que vaya preguntando y guardando en un array el nombre de un alumno y
//sus notas de exámenes, trabajos y actitud en un trimestre. Así para tres alumnos. A continuación 
//mostrará una lista con el nombre de cada alumno y su nota de evaluación, que vendrá dada por la 
//fórmula:
package arrays;

import java.util.*;

public class EjercicioArrays2_22 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String evaluacion[][] = new String [3][4];
		
		float total = 0;
		
		
		for (int i = 0; i < evaluacion.length; i++){
			System.out.print("Nombre:");
			evaluacion[i][0] = entrada.nextLine();
			System.out.print("Nota examen:");
			evaluacion[i][1] = entrada.nextLine();
			System.out.print("Nota trabajos:");
			evaluacion[i][2] = entrada.nextLine();
			System.out.print("Nota actitud:");
			evaluacion[i][3] = entrada.nextLine();
				
			}
		
		System.out.println("Notas evaluación");
		System.out.println("============================");
		for (int i = 0; i < evaluacion.length; i++){
			System.out.println(evaluacion[i][0] + "\t" + evaluacion[i][1] + "\t" + evaluacion[i][2] + "\t" + evaluacion[i][3]);
			total = (50*Float.parseFloat(evaluacion[i][1]) + 40*Float.parseFloat(evaluacion[i][2]) + 10*Float.parseFloat(evaluacion[i][3]))/100;	
		}
		System.out.println("============================");
		System.out.println("Media final");
		System.out.println("============================");
		for (int i = 0; i < evaluacion.length; i++){
			System.out.println(evaluacion[i][0] + ": " + total) ;
		}
		

		
		
		
		
		
		
		

	}

}
