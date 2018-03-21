package paquete1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo04Checkbox extends JFrame{
	
	public Ejemplo04Checkbox() {
		super("Géneros de películas");
		
		setSize(200, 330);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblGenero = new JLabel("Elige tus preferencias: ");
		
		
				
		JCheckBox chkOpcion1 = new JCheckBox("Policiaco            ", true);
		
		JCheckBox chkOpcion2 = new JCheckBox("Rómantico            ", false);
		JCheckBox chkOpcion3 = new JCheckBox("Acción               ", true);
		JCheckBox chkOpcion4 = new JCheckBox("Drama                ", false);
		JCheckBox chkOpcion5 = new JCheckBox("Zombies              ", false);
		JCheckBox chkOpcion6 = new JCheckBox("Ciencia ficción      ", false);
		JCheckBox chkOpcion7 = new JCheckBox("Bélico               ", true);
		JCheckBox chkOpcion8 = new JCheckBox("Fantasia             ", false);
		
		add(lblGenero);
		add(chkOpcion1);
		add(chkOpcion2);
		add(chkOpcion3);
		add(chkOpcion4);
		add(chkOpcion5);
		add(chkOpcion6);
		add(chkOpcion7);
		add(chkOpcion8);
		
		
		setVisible(true);
	}
	

	public static void main(String[] args) {
	
		Ejemplo04Checkbox pelicula = new Ejemplo04Checkbox();

	}

}
