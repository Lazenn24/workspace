package paquete1;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.*;

public class Playback extends JFrame{
	
	public Playback() {
		super("Playback");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		JButton btnNuevo = new JButton("Nuevo");
		JButton btnAbrir = new JButton("Abrir");
		JButton btnGuardar = new JButton("Guardar");
		JButton btnGuardarComo = new JButton("Guardar como");
		JButton btnSalir = new JButton("Salir");
		add(btnNuevo);
		add(btnAbrir);
		add(btnGuardar);
		add(btnGuardarComo);
		add(btnSalir);
		setVisible(true);
		
		
	}
	
	
	

	public static void main(String[] args) {
		
		Playback pb = new Playback();

	}

}
