package paquete1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;

public class Ejemplo12Listas extends JFrame {

	public Ejemplo12Listas() {

		super("");
		setSize(200, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		JLabel lblMensaje = new JLabel("Elija versión:");
		
		String[] versiones = {"Windows XP", "Windows Vista", "Windows 7", "Windows 8", "Windows 10"};

		JList<String> lstVersiones = new JList<>(versiones);
		JScrollPane panelVersiones = new JScrollPane(lstVersiones);
		panelVersiones.setPreferredSize(new Dimension(170, 100));
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setPreferredSize(new Dimension(170, 23));
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setPreferredSize(new Dimension(170, 23));
		
		add(lblMensaje);
		add(panelVersiones);
		add(btnSiguiente);
		add(btnCancelar);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		
		Ejemplo12Listas ventana = new Ejemplo12Listas();
	}
}
