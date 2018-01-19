//22.- Crea un programa que calcule la hora de cierre de una tienda. Esta hora depende del valor de 
//una variable de tipo String llamada dia.
//Si su valor es "entre semana", la hora de cierre de la tienda 
//será "20:00". En otro caso, la hora de cierre será "14:00".
package condicionales;
import java.util.*;
public class ejCondicionales22 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		String respuesta;
		
		
		System.out.println("¿Que dia de la semana es?");
		System.out.println("1) Entre semana.");
		System.out.println("2)Fin de semana.");
		String dia = entrada.nextLine();
		
		respuesta = (dia.equals("entre semana")) ?
				"La hora de cierre es a las 20:00"
				: "La hora de cierre es a las 14:00";
		
		System.out.println(respuesta);
		
			
			
		
		

	}

}
