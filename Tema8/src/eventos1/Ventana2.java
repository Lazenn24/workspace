package eventos1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana2 extends JFrame {

	public Ventana2() {

		super("Formatear");
		setSize(300, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		JButton btnBorrar = new JButton("Borrar disco duro.");
		btnBorrar.addActionListener(new Manejador2());
		
		JLabel lblBorrar = new JLabel("Pulsa el botón para borrar el disco duro.");
		
		add(btnBorrar);
		add(lblBorrar);
		
		
		
		

		setVisible(true);

	}

	public static void main(String[] args) {
		Ventana2 ventana = new Ventana2();
	}

}
