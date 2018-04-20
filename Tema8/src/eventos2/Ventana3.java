package eventos2;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana3 extends JFrame implements ActionListener{
	
	private JButton btnArriba;
	private JButton btnAbajo;
	private JLabel lblPulsado;
	
	public Ventana3() {
	super("Pulsa el botón");
	setSize(300, 200);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	setLayout(new FlowLayout(FlowLayout.CENTER));
	
	btnArriba = new JButton("Botón Arriba");	
	btnArriba.addActionListener(this);
	
	btnAbajo = new JButton("Botón Abajo");	
	btnAbajo.addActionListener(this);

	lblPulsado = new JLabel("Pulsa un botón.");
	
	
	add(btnArriba);
	add(btnAbajo);
	add(lblPulsado);
	

	setVisible(true);
}


	public static void main(String[] args) {
		Ventana3 ventana = new Ventana3();

	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnPulsado = (JButton) e.getSource();
		
		// Forma alternativa si solo queremos mostrar que boton se ha pulsado.
		
		String nombreBtnPulsado = btnPulsado.getText().toLowerCase();
		lblPulsado.setText("Has pulsado el botón " + nombreBtnPulsado + ".");
		
		
		// En funcion de que boton se ha pulsado, mostramos un mensaje un otro.
		
//		if(btnPulsado.getText().equals("Botón Arriba")) {
//			lblPulsado.setText("Botón de arriba.");
//		}else {
//			lblPulsado.setText("Botón de abajo.");
//		}
		
	}

}
