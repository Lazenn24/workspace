package main;

import instituto.*;
import auxiliar.*;

public class Main {

	public static void main(String[] args) {
		
		Grupo grupo = new Grupo(1, "ESO", 4, "B");
		
		grupo.leeDatos();
		
		System.out.println(grupo.toString());

	}

}
