package paquete1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

public class Ejemplo13ProgressBar extends JFrame {

	public Ejemplo13ProgressBar() {

		super("Nivel de depósito");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JLabel lblCombustible = new JLabel("Combustible");
		JProgressBar prgNivel = new JProgressBar(0, 50);
		prgNivel.setPreferredSize(new Dimension(290, 30));
		prgNivel.setForeground(new Color(255, 117, 26));
		prgNivel.setBackground(new Color(255, 209, 179));
		prgNivel.setValue(35);

		prgNivel.setStringPainted(true);

	
		add(lblCombustible);
		add(prgNivel);

		setVisible(true);
		
		for (int i = 30; i >= 0; i--) {
			prgNivel.setValue(i);
			lblCombustible.setText("Combustible (" + i + " litros)");
			try {
				Thread.sleep(500);
				
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {

		Ejemplo13ProgressBar ventana = new Ejemplo13ProgressBar();
	}
}
