package ejemplos;
/**
 *
 */

import java.util.Scanner;

/**
 * @author Ramon Práctica de Cadenas Fecha 30-12-2017 22:50:35Hrs.
 * 
 */
public class PracticaEntrega {

	/**
	 * DESCROPCIÓN: Operaciones con los distintos métodos que aparecen a
	 * continuación. 1. length( ) 2. charAt (numPosicion) 3.
	 * replace('caracter_antiguo','caracter_nuevo') 4. indexOf(textoABuscar) 5.
	 * lastIndexOf(textoABuscar) 6. compareTo(textoPorComparar) 7.
	 * substring(posiciónInicial, posiciónFinal) 8. split(textoSeparador) 9.
	 * String.valueOf(valor) 10. Integer.parseInt(texto).
	 */
	public static void main(String[] args) {

		System.out.println(" \t  *== Práctica de Cadenas ==*");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		// Ejemplo de variables a ser usadas
		String Palabra2 = "ramonrfpa88@hotmail.es";
		String miPalabra = "Ordenador";
		String CitaCelebre1 = "Solo somos un instante en el tiempo, "
				+ "pero nuestro legado es para siempre.";
		System.out.println("Cita celebre 1: " + CitaCelebre1);
		String CitaCelebre2 = "Las cosas son como son "
				+ "y no son siempre como deben ser.";
		System.out.println("Cita celebre 2: " + CitaCelebre2);
		String personas = "#01 Ramon#02 Damian#03 Nico#04 Justin#05 Santi#06 Adrian#07 Alejandro";
		System.out.println();
		// String variableNum = "1988";

		// 1- Ejemplo del metodo length()
		// Descripción: Recorre toda la palabra hasta el
		// ultimo caracter.
		System.out.println("Metodo: lenght()");
		System.out.println("----------------");
		System.out.println("1º Ejemplo");
		System.out.println("El numero de caracteres de la palabra " + miPalabra
				+ " es " + miPalabra.length());
		System.out.println("La  \"CitaCelebre1\"  tiene "
				+ CitaCelebre1.length() + " caracteres");
		System.out.println("La  \"CitaCelebre2\"  tiene "
				+ CitaCelebre2.length() + " caracteres");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("2º Ejemplo");
		// 2- Metodo CharAt
		// Descripción: Localiza la posición metida por parámetro y te
		// devuelve su posición en la palabra.
		System.out.println("Metodo: ChartAt()");
		System.out.println("----------------");
		System.out.println("La posicion 6 de " + miPalabra + " es: "
				+ miPalabra.charAt(6));
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("3º Ejemplo");
		// 3- Metodo replace
		// Descripcion: Este metodo sustituye un caracter antiguo por uno
		// nuevo en la posición que se le indique.
		System.out.println("Metodo: replace()");
		System.out.println("----------------");
		System.out.println("El caracter antiguo es" + " Or " + "y el nuevo es "
				+ " Er " + miPalabra.replace(" Or ", " Er "));
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("4º Ejemplo");
		// 4- Metodo indexOf
		// Descrpcion: Devuelve la posición mediante un número entero de
		// un caracter de una cadena de texto.
		// En el caso de no existir devuelve -1 en el segundo en la posición 0.
		// Ejemplo de que la variable no existe.
		System.out.println("Metodo: indexOF()");
		System.out.println("----------------");
		System.out.println(miPalabra.indexOf(4));
		System.out.println("El caracter \"a\" esta en la posicion: "
				+ miPalabra.indexOf("a")
				+ " de la cadena de caracteres Ordenador");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("5º Ejemplo");
		// 5- Metodo lastIndexOf
		// Descropción: Nos devuelve la última posición de un número
		// entero dentro de una cadena de texto
		// Si no existe se devuelve -1
		System.out.println("Metodo: lastIndexOF()");
		System.out.println("---------------------");
		System.out.println("El caracter esta en la posicion: "
				+ Palabra2.lastIndexOf("."));
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("6º Ejemplo");
		// 6- Metodo compareTo
		// Descripción: Método que realiza una comparación entre dos
		// cadenas, la que invoca y la que es pasada por parámetro. La
		// comparación está basada en el valor Unicode de las cadenas.
		// El valor retornado será negativo si el valor de la cadena es menor
		// que el valor de la cadena pasada como parámetro. El resultado será
		// positivo si el valor de la cadena es mayor que el valor de la cadena
		// pasada por parámetro. Se devolverá cero si las dos cadenas son
		// iguales. En este caso es igual que cuando el método .equals devuelve
		// true.
		// Número negativo la primera es menor, positivo mayor "0" son iguales.
		System.out.println("Metodo: compareTo()");
		System.out.println("-------------------");
		System.out.println("Comparamos las 2, CitaCelebre2 con 1: "
				+ CitaCelebre1.compareTo(CitaCelebre2));
		System.out.println("Comparamos las 2, CitaCelebre1 con 2: "
				+ CitaCelebre2.compareTo(CitaCelebre1));
		System.out.println("La primera cita es mayor que la segunda.");
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("7º Ejemplo");
		// 7- Metodo substring(posiciónInicial, posiciónFinal)
		// Descripción:Devuelve una
		// subcadena, la cual corresponde al contenido
		// entre los valores beginIndex y endIndex. En el caso de que no se
		// especifique endIndex, se asumirá como índice el final de la cadena.
		System.out.println("Metodo: substring()");
		System.out.println("-------------------");
		System.out.println("En la posicion 65 de \"CitaCelebre1\" aparece: "
				+ CitaCelebre1.substring(65));
		System.out.println("Entre la posicion 50 y la 65 aparece: "
				+ CitaCelebre1.substring(50, 65));

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("8º Ejemplo");
		// 8- Metodo split
		// Descripción: Divide una cadena cada vez que encuentra un
		// delimitador que coincida con la expresión regular pasada como
		// parámetro.
		// String personas = "#01Ramon#02Javier#03Francisco
		// #04Jessica#05Itzi#06Carlos#07Salva";
		System.out.println("Metodo: split()");
		System.out.println("---------------");
		System.out.println("Array Nombres");
		System.out.println("-------------");
		String nombres[] = personas.split("#");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(" " + nombres[i]);
		}

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("9º Ejemplo");
		// 9- Metodo String.valueOf(valor)
		// Descripción: Convierte a cadenas los tipos de
		// datos pasados como parámetro. En el caso de que queramos convertir un
		// array de caracteres en una cadena podemos tener una excepción
		// IndexOutOfBoundsException en el caso de que intentemos acceder a un
		// elemento que no exista.
		System.out.println("Metodo: valueOf()");
		System.out.println("-----------------");
		char caracteres[] = { 'R', 'A', 'M', 'O', 'N' };
		System.out.println(String.valueOf(caracteres));
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("10º Ejemplo");
		// 10- Metodo Integer.parseInt
		// Descripcion: Convierte una cadena de texto en un
		// número entero.
		System.out.println("Metodo: Integer.ParseInt()");
		System.out.println("--------------------------");

		System.out.println("La variable año es un String pasando a int");
		System.out
				.println("Abajo se realiza una operación de conversión con Parse.Int\n");
		Scanner sc = new Scanner(System.in);
		String mes = " ";
		String año = " ";
		System.out.println("Ejemplo sobre Parse.Int");
		System.out.println("-----------------------");
		System.out.println("Introduce tu mes de nacimiento: ");
		mes = sc.nextLine();
		System.out.println("Introduce tu año: ");
		año = sc.nextLine();
		// Conversion usando el Parse.Int
		int fecha = Integer.parseInt(año);
		System.out.println("Ejemplo: " + " Tu naciste en " + mes + " de "
				+ fecha + " y tienes " + (2017 - fecha)
				+ " años o los vas a cumplir.");
		sc.close();
		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");

		System.out.println("Hecho por: Ramon Fernando");

		System.out.println("*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=*=* ");
		System.out.println(" \t   *== Fin de la Práctica ==*");
	}

}