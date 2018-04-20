package paquete3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 *  Ejemplo en el que en lugar de usar clases internas anonimas, usamos una clase adaptador
 */

public class Ejemplo08MouseAdapter extends JFrame {

	private JLabel lblCoordenadas;
	private JLabel lblBoton;
	
	public Ejemplo08MouseAdapter() {

		super("Mouse adapter");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lblCoordenadas = new JLabel("Haz click en la ventana");
		lblBoton = new JLabel();

		add(lblCoordenadas);
		add(lblBoton);
		
		
		addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				super.mouseClicked(e);
				
				lblCoordenadas.setText("Coordenadas: (" + e.getX() + ", " + e.getY() + ")");
				lblBoton.setText("Botón: " + e.getButton());
			}
			
		});
		
		

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo08MouseAdapter ventana = new Ejemplo08MouseAdapter();
	}

}