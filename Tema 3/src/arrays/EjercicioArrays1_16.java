package arrays;

public class EjercicioArrays1_16 {

	public static void main(String[] args) {
		
		double temperaturas[] = { 15, 16.1, 16, 15.4, 15, 14, 10.2, 11, 11.5, 10, 10.1, 9.8, 9, 6};
		double total = 0;
		
		for(int i = 0; i < temperaturas.length; i++){
			total = total + temperaturas[i];
		}
		
		System.out.println("Temperatura media " + " = " + (total/temperaturas.length) + ".");
		
		int bajas = 0;
		for (int i = 0; i < temperaturas.length; i++){
			if(temperaturas[i] > 12) {
				bajas++;
			}
		}
		System.out.println("Ha habido "+ bajas + " temperaturas menores de 12.");

	}

}
