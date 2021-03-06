package eventos3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame {

	private JLabel lblPulsado;;
	
	public Ventana() {

		super("Titulo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton btnPulsar = new JButton("Púlsame!");
		
		btnPulsar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				lblPulsado.setText("Has pulsado!");
				
			}
		});
		lblPulsado = new JLabel("No has pulsado el botón, todavía");
		
		add(btnPulsar);
		add(lblPulsado);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ventana ventana = new Ventana();
	}

}