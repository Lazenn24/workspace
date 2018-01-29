package inicio;

import java.util.Scanner;

import conversion.Conversor;

public class Inicio {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		double km;
		double mb;
		double cal;

		System.out.print("Pon una distancia en KM:");
		km = in.nextDouble();

		System.out.println(Conversor.millas(km) + " millas.");

		System.out
				.print("Pon una precion en milibares para convertirlo en atmos:");
		mb = in.nextDouble();

		System.out.println(Conversor.atmosferas(mb) + " atmósferas.");

		System.out.println("De colirias a julios");
		cal = in.nextDouble();

		System.out.println(Conversor.julios(cal) + " julios.");

	}

}
