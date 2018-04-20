package paquete2;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ejemplo05EmptyBorder extends JFrame {

	public Ejemplo05EmptyBorder() {

		super("Borde vacío");
//		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel pnlDato = new JPanel();
		pnlDato.setBorder(BorderFactory.createEmptyBorder(40, 0, 0, 0));
		pnlDato.setPreferredSize(new Dimension(200, 150));
		
		JLabel lblNombre = new JLabel("Nombre completo");
		JTextField txtNombre = new JTextField(15);

		pnlDato.add(lblNombre);
		pnlDato.add(txtNombre);
		
		add(pnlDato);
		
		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo05EmptyBorder ventana = new Ejemplo05EmptyBorder();
	}

}