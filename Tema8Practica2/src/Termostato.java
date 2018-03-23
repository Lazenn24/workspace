import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Termostato extends JFrame {
	
	public Termostato() {
		
	super("Termostato");
	setSize(250, 200);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new FlowLayout(FlowLayout.LEFT));
	
	// Slider
	
	JSlider sldTermo = new JSlider(JSlider.VERTICAL);
	sldTermo.setMaximum(25);
	sldTermo.setMinimum(0);
	sldTermo.setValue(17);
	
	sldTermo.setMajorTickSpacing(5);
	sldTermo.setMinorTickSpacing(1);
	sldTermo.setPaintTicks(true);
	sldTermo.setPaintLabels(true);
	
	// Label
	JLabel lblTermo = new JLabel("Temperatura (ºC)");
	
	sldTermo.setPreferredSize(new Dimension(60, 180));
	
	add(sldTermo);
	add(lblTermo);
	
	setVisible(true);
	
	}
	

	public static void main(String[] args) {
		
		Termostato ventana = new Termostato();

	}

}
