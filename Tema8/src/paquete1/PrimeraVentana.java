package paquete1;

import javax.swing.JFrame;

public class PrimeraVentana extends JFrame {

	public PrimeraVentana() {

		super("Hola, Mundo");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		setVisible(true);
	}

	public static void main(String[] args) {

		PrimeraVentana ventana = new PrimeraVentana();
		

	}

}
