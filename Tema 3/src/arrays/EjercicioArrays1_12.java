//12.- Escribe una aplicación que cree un array de 100 posiciones llamado matriculas y rellene todas 
//las posiciones con el valor por defecto "sinmatricula". Haz que después se muestren todos los 
//valores mediante un bucle for.
package arrays;

public class EjercicioArrays1_12 {

	public static void main(String[] args) {
		
		String matriculas[] = new String[100];
		
		for (int i = 0; i < matriculas.length; i++){
			matriculas[i] = "sinmatricula";
		}
		
		for (int i = 0; i < matriculas.length; i++){
			System.out.println("Matrícula " + i + ":" + matriculas[i] + ".");
		}
		
		

	}

}
