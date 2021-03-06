//8.- La siguiente tabla muestra la humedad relativa en una localidad de Mallorca a lo largo de las 24 
//horas de un día. Crea un programa capaz de recorrer este array e indicar cuáles han sido las 
//humedades máxima y mínima del día, y a qué horas se han producido
package arrays;

public class EjercicioArrays2_08 {

	public static void main(String[] args) {
		
		int humedad[] = {45, 40, 40, 40, 37, 35, 39, 39, 45, 50, 55, 60, 65, 70, 70, 75, 75, 72, 65, 60, 55, 50, 50, 45};
		
		int posMin = 0;
		int posMax = 0;
		
		for(int i = 0; i < humedad.length; i++){
			
			if(humedad[i] < humedad[posMin]){
				posMin = i;
			}
			if(humedad[i] > humedad[posMax]){
				posMax = i;
			}
		}
		System.out.println("Húmedad máxima de " + humedad[posMax] + " alcanzada a la hora " + posMax);
		System.out.println("Húmedad mínima de " + humedad[posMin] + " alcanzada a la hora " + posMin);

	}

}
