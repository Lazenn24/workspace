//9.- Escribe un programa que lea desde la consola el enunciado de una pregunta y las cuatro posibles
//respuestas, guardando los cinco valores en un array llamado test. A continuación los mostrará cómo 
//si fuera una pregunta de tipo test.
package arrays;

public class EjercicioArrays1_09 {

	public static void main(String[] args) {
		
		String pregunta[] = {"¿Quién creó el Altair 8800, el primer ordenador personal?", "a) Bill Gates", "b) Steve Jobs", "c) Ed Roberts", "d) Gary Kildall"};
		
		for (int i = 0; i < pregunta.length; i++){
			System.out.println(pregunta[i]);
		}

	}

}
