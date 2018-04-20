package paquete2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo07LineBorder extends JFrame {

	public Ejemplo07LineBorder() {

		super("Borde de color");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		// Panel izquierdo
		
		JPanel pnlIzquierdo = new JPanel();
		pnlIzquierdo.setPreferredSize(new Dimension(140, 180));
		pnlIzquierdo.setBorder(BorderFactory.createLineBorder(Color.RED, 5, true));
		pnlIzquierdo.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btn1 = new JButton("Atrás");
		btn1.setPreferredSize(new Dimension(120, 20));
		JButton btn2 = new JButton("Adelante");
		btn2.setPreferredSize(new Dimension(120, 20));
		pnlIzquierdo.add(btn1);
		pnlIzquierdo.add(btn2);
		
		// Panel derecho
		
		JPanel pnlDerecho = new JPanel();
		pnlDerecho.setPreferredSize(new Dimension(140, 180));
		pnlDerecho.setBorder(BorderFactory.createLineBorder(Color.BLUE, 5, true));
		pnlDerecho.setLayout(new FlowLayout(FlowLayout.LEFT));
		JButton btn3 = new JButton("Arriba");
		btn3.setPreferredSize(new Dimension(120, 20));
		JButton btn4 = new JButton("Abajo");
		btn4.setPreferredSize(new Dimension(120, 20));
		pnlDerecho.add(btn4);
		pnlDerecho.add(btn3);
		
		// Ventana completa
		
		add(pnlIzquierdo);
		add(pnlDerecho);
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo07LineBorder ventana = new Ejemplo07LineBorder();
	}

}