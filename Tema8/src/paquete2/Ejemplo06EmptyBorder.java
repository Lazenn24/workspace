package paquete2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo06EmptyBorder extends JFrame {

	public Ejemplo06EmptyBorder() {

		super("Púlsame");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel pnlBoton = new JPanel();
		JButton btnPulsar = new JButton("Púlsame");
		pnlBoton.setBorder(BorderFactory.createEmptyBorder(45, 80, 0, 0));
		btnPulsar.setPreferredSize(new Dimension(120, 80));
		
		pnlBoton.add(btnPulsar);
		
		add(pnlBoton);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo06EmptyBorder ventana = new Ejemplo06EmptyBorder();
	}

}