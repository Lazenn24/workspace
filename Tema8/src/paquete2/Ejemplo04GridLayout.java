package paquete2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ejemplo04GridLayout extends JFrame {

	public Ejemplo04GridLayout() {

		super("Dificultad");
		setSize(200, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new GridLayout(2, 1, 10, 10));
		
		// Panel superior
		JPanel panelArriba = new JPanel();
		panelArriba.setLayout(new FlowLayout(FlowLayout.LEFT));
		
	
		JLabel lblDificultad = new JLabel           ("Dificultad        ");
		
		JRadioButton rdbFacil = new JRadioButton    ("Fácil             ");
		JRadioButton rdbNormal = new JRadioButton   ("Normal            ", true);
		JRadioButton rdbImposible = new JRadioButton("Imposible         ");
		
		ButtonGroup grupo = new ButtonGroup();
		
		grupo.add(rdbFacil);
		grupo.add(rdbNormal);
		grupo.add(rdbImposible);
		
		
		panelArriba.add(lblDificultad);
		panelArriba.add(rdbFacil);
		panelArriba.add(rdbNormal);
		panelArriba.add(rdbImposible);
		
		
		// Panel inferior
		JPanel panelAbajo = new JPanel();
		panelAbajo.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JButton btnSiguiente = new JButton("Siguiente >>");
		JButton btnAtras = new JButton("<< Atrás");
		
		btnSiguiente.setPreferredSize(new Dimension(140, 25));
		btnAtras.setPreferredSize(new Dimension(140, 25));
		
		panelAbajo.add(btnSiguiente);
		panelAbajo.add(btnAtras);
		
		
		
		// Ventana completa
		add(panelArriba);
		add(panelAbajo);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo04GridLayout ventana = new Ejemplo04GridLayout();
	}

}
