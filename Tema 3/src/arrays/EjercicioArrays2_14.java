// 14.- Esta tabla muestra los nombres y precios de cuatro artículos de unos grandes almacenes:

package arrays;

public class EjercicioArrays2_14 {

	public static void main(String[] args) {

		String precios[][] = { { "Tablet Samsgung", "120" },
				{ "Móvil Sony", "115" }, { "Ipad Mini", "290" },
				{ "Móvil HTC", "95" } };
		
		float total = 0;
		float precio;

		System.out.println("Artículos");
		System.out.println("=========================");
		for (int i = 0; i < precios.length; i++){
			System.out.println(precios[i][0] + "\t" + precios[i][1]);
			precio = Float.parseFloat(precios[i][1]);
			total = total + precio;
		}
		
		System.out.println("El precio total de los productos es " + total);

	}

}
