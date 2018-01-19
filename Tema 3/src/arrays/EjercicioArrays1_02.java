//2.- Crea un array de Strings llamado meses cuyos valores sean los nombres de los doce meses del 
//año. Haz que después se muestren todos los valores mediante un bucle while.
package arrays;

public class EjercicioArrays1_02 {

	public static void main(String[] args) {
		
		String meses[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		int i = 0;
		
		while(i < meses.length){
			System.out.println("El mes " + (i+1) + " es " + meses[i]);
			i++;
		}
		
		

	}

}
