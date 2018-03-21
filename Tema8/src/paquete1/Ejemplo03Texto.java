package paquete1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo03Texto extends JFrame {

	public Ejemplo03Texto() {

		super("Texto");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		JLabel lblUrl = new JLabel("Direccion web: ");
		JTextField txtUrl = new JTextField("Escriba aqui la URL...", 20);
		JButton btnAceptar = new JButton("Aceptar");
		
		add(lblUrl);
		add(txtUrl);
		add(btnAceptar);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ejemplo03Texto ventana = new Ejemplo03Texto();

	}

}
