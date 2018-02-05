package auxiliar;

import java.util.Scanner;

public class Grupo {
	
	private int id;
	private String nivel;
	private int curso;
	private String clase;
	
	public Grupo(int id, String nivel, int curso, String clase) {
		 this.id = id;
		 this.nivel = nivel;
		 this.curso = curso;
		 this.clase = clase;
	}
	
	public String toString() {
	 
		String resultado = id + " - " + nivel + " - " + curso + " - " + clase;
		
		return resultado;
	}
	
	public void leeDatos() {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Id del grupo? ");
		id = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Nivel del grupo (ESO, Bachiller, FP)? ");
		nivel = entrada.nextLine();
		
		System.out.print("Curso (1, 2, 3, 4)? ");
		curso = entrada.nextInt();
		
		entrada.nextLine();
		
		System.out.print("Clase (A, B, C, D) ");
		clase = entrada.nextLine();
		
	}
	
	

}
