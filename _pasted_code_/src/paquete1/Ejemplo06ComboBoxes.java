package paquete1;

import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Ejemplo06ComboBoxes extends JFrame{

	public Ejemplo06ComboBoxes() {
		
		super("Meses del año");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		setVisible(true);
	}
	
	