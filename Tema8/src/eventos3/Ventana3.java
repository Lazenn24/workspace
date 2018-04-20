package eventos3;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana3 extends JFrame{

	private JButton btnArriba;
	private JButton btnAbajo;
	private JLabel lblPulsado;

	public Ventana3() {
		super("Pulsa el botón");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));

		btnArriba = new JButton("Botón Arriba");
		btnArriba.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPulsado.setText(btnArriba.getText());
				
			}
		});

		btnAbajo = new JButton("Botón Abajo");
		btnAbajo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPulsado.setText(btnAbajo.getText());
				
			}
		});

		lblPulsado = new JLabel("Pulsa un botón.");

		add(btnArriba);
		add(btnAbajo);
		add(lblPulsado);

		setVisible(true);
	}

	public static void main(String[] args) {
		Ventana3 ventana = new Ventana3();

	}

}
