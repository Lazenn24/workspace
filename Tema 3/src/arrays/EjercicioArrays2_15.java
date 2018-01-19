// 15.- Añade al programa anterior otro bucle que recorra el array y encuentre el menor y el mayor precio.
package arrays;

public class EjercicioArrays2_15 {

	public static void main(String[] args) {

		String precios[][] = { { "Tablet Samsgung", "120" },
				{ "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };

		float total = 0;
		float precio;
		int posMin = 0;
		int posMax = 0;

		System.out.println("Artículos");
		System.out.println("=========================");
		for (int i = 0; i < precios.length; i++) {
			System.out.println(precios[i][0] + "\t" + precios[i][1]);
			precio = Float.parseFloat(precios[i][1]);
			total = total + precio;
		}

		System.out.println("El precio total de los productos es " + total);

		// Calculamos el maximo y el minimo
		for (int i = 0; i < precios.length; i++) {

			float precioEnI = Float.parseFloat(precios[i][1]);
			float precioEnPosicion = Float.parseFloat(precios[posMin][1]);
			
			if (precioEnI < precioEnPosicion) {
				posMin = i;
			}
			
			if (precioEnI > precioEnPosicion){
				posMax = i;
			}

		}
		
		System.out.println("El precio más bajo es " + precios[posMin][1]);
		System.out.println("El precio más alto es " + precios[posMax][1]);

	}
}
