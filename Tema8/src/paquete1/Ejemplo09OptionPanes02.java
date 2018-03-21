package paquete1;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ejemplo09OptionPanes02 {

	public static void main(String[] args) {
		
//		String cuenta = JOptionPane.showInputDialog(null, "Ingrese su codigo de cuenta: ", "Cuenta bancaria", JOptionPane.QUESTION_MESSAGE);
//		
//		JOptionPane.showMessageDialog(null, "Su cuenta es " + cuenta, "Cuenta bancaria", JOptionPane.INFORMATION_MESSAGE);
		
		
		String[] estaciones = {"Primavera", "Verano", "Otoño", "Invierno"};
		
		int estacion = JOptionPane.showOptionDialog(null, "¿En que estacion naciste?", "Estaciones", 0, JOptionPane.QUESTION_MESSAGE, null, estaciones, estaciones[0]);
		
		JOptionPane.showMessageDialog(null, "Naciste en " + estaciones[estacion] + ".", "Estaciones", JOptionPane.INFORMATION_MESSAGE);
		

	}

}
