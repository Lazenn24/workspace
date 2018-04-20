package eventos2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana2 extends JFrame implements ActionListener {
	
	private JButton btnPulsar;
	private boolean pulsado = true;
	
	public Ventana2() {
		
		super("Pulsa el botón");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		btnPulsar = new JButton("Encendido");
		btnPulsar.setPreferredSize(new Dimension(200,150));
		
		btnPulsar.addActionListener(this);;
		
		add(btnPulsar);
		

		setVisible(true);
	}

	public static void main(String[] args) {
		
		Ventana2 ventana = new Ventana2();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(pulsado) {
			btnPulsar.setText("Apagado");
			pulsado = false;
		}else {
			btnPulsar.setText("Encendido");
			pulsado = true;
		}
		
	}

}
