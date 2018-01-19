//19.- Crea un programa que vaya pidiendo por la terminal los apellidos, el nombre y el sueldo de
//cuatro empleados de una empresa, y guardándolo como filas en un array bidimensional llamado
//nominas. A continuación muestra los datos por la pantalla en forma de tabla y calcula el salario total
//que paga la empresa cada mes
package arrays;

import java.util.*;

public class EjercicioArrays2_19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		String nominas[][] = new String[4][3];
		
		float total = 0;
		float sueldo;
		
		for (int i = 0; i < nominas.length; i++) {
			System.out.println("Nombre:");
			nominas[i][0] = entrada.nextLine();
			System.out.println("Apellidos:");
			nominas[i][1] = entrada.nextLine();
			System.out.println("Sueldo:");
			nominas[i][2] = entrada.nextLine();
		}
		
		System.out.println("Empleados");
		System.out.println("=======================");
		System.out.println("Nombre \t Apellido \t Sueldo");
		for (int i = 0; i < nominas.length; i++) {
			System.out.println(nominas[i][0] + "\t" + nominas[i][1] + "\t" + nominas[i][2]);
			sueldo = Float.parseFloat(nominas[i][2]);
			total = total + sueldo;
		}
		
		System.out.println("El sueldo total es " + total);
		
		

	}
}

