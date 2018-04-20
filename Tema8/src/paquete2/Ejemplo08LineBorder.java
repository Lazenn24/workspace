package paquete2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo08LineBorder extends JFrame {

	public Ejemplo08LineBorder() {

		super("Titulo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// Panel izquierdo
		
		JPanel pnlIzq = new JPanel();
		pnlIzq.setPreferredSize(new Dimension(140, 140));
		pnlIzq.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
		
		// Panel derecho
		
		JPanel pnlDer = new JPanel();
		pnlDer.setPreferredSize(new Dimension(140, 140));
		pnlDer.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5, true));
		
		// Panel abajo
		
		JPanel pnlAbajo = new JPanel();
		pnlAbajo.setPreferredSize(new Dimension(290, 45));
		pnlAbajo.setBorder(BorderFactory.createLineBorder(Color.GREEN, 5, true));
		
		// Ventana
		add(pnlIzq);
		add(pnlDer);
		add(pnlAbajo);
		
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo08LineBorder ventana = new Ejemplo08LineBorder();
	}

}