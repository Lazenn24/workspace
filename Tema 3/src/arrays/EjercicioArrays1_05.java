//5.- Crea un array llamado notas con cinco posiciones y ve asignando a cada una de ellas el valor de 
//un examen que hayas hecho este curso (no sólo de programación). Haz que después se muestren 
//todos los valores mediante un bucle while.
package arrays;

public class EjercicioArrays1_05 {

	public static void main(String[] args) {

		float notas[] = new float[4];

		notas[0] = 8.5f;
		notas[1] = 7.4f;
		notas[2] = 5.5f;
		notas[3] = 7;

		int i = 0;

		while (i < notas.length) {

			System.out.println("La nota " + (i + 1) + " es " + notas[i]);
			i++;
		}

	}

}
