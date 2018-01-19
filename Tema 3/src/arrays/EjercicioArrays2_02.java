//2.- Crea una aplicación que vaya leyendo y guardando en un array las estaturas de 10 personas. A 
//continuación, recorrerá el array y nos informará de si alguna de estas estaturas es mayor de 1'90 m.
package arrays;

public class EjercicioArrays2_02 {

	public static void main(String[] args) {
		
		double alturas[] = { 1.70, 1.85, 1.92, 1.62, 1.78, 1.95, 2, 1.50, 1.58, 1.65};
		
		boolean alto = false;
		
		for (int i = 0; i < alturas.length; i++){
			if(alturas[i] > 1.90){
				alto = true;
			}
			
		}
		if (alto == true){
			System.out.println("Localizada persona mayor a 1.90.");
		}else{
			System.out.println("No hay nadie de mas de 1.90.");
		}
		
		

	}

}
