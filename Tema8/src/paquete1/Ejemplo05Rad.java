package paquete1;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Ejemplo05Rad extends JFrame {
	
	public Ejemplo05Rad() {
		
		super("Nacionalidad");
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		ButtonGroup pais = new ButtonGroup();
		
		JLabel lblNacionalidad = new JLabel("Marca tu nacionalidad");
		
		JRadioButton rdbOpcion1 = new JRadioButton("España                            ", true);
		JRadioButton rdbOpcion2 = new JRadioButton("Francia                           ");
		JRadioButton rdbOpcion3 = new JRadioButton("Portugal                          ");
		JRadioButton rdbOpcion4 = new JRadioButton("Argentina                         ");
		JRadioButton rdbOpcion5 = new JRadioButton("Ecuador                           ");
		
		JButton btnSiguiente = new JButton("Siguiente");
		
		add(lblNacionalidad);
		add(rdbOpcion1);
		add(rdbOpcion2);
		add(rdbOpcion3);
		add(rdbOpcion4);
		add(rdbOpcion5);
		pais.add(rdbOpcion1);
		pais.add(rdbOpcion2);
		pais.add(rdbOpcion3);
		pais.add(rdbOpcion4);
		pais.add(rdbOpcion5);
		add(btnSiguiente);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		
		
		

		Ejemplo05Rad nacionalidad = new Ejemplo05Rad();

	}

}
