//7.- La siguiente tabla guarda el número de espectadores que vieron La 2a las 23:00 horas, cada día 
//de la semana. Escribe un programa que busque el máximo y el mínimo de audiencia en esta semana.
package arrays;

public class EjercicioArrays2_07 {

	public static void main(String[] args) {

		int audicencia[] = { 2000000, 2500000, 3100000, 3000000, 1200000,
				1800000, 2050000 };

		int posMin = 0;
		int posMax = 0;

		for (int i = 0; i < audicencia.length; i++) {
			if (audicencia[i] < audicencia[posMin]) {
				posMin = i;
			}
			if (audicencia[i] > audicencia[posMax]) {
				posMax = i;
			}
		}
		System.out.println("El dia " + posMin + " tuvo el mínimo de audiencia con " + audicencia[posMin] + " espectadores.");
		System.out.println("El dia " + posMax + " tuvo el máximo de audiencia con " + audicencia[posMax] + " espectadores.");

	}

}
