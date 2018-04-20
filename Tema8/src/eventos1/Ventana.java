package eventos1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {

	public Ventana() {

		super("Pulsar botón");
		setSize(300, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		JButton btnPulsar = new JButton("Púlsame!");
		
		btnPulsar.addActionListener(new Manejador());
		JLabel lblPulsado = new JLabel("No has pulsado el botón, todavía");
		
		add(btnPulsar);
		add(lblPulsado);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
	}

}