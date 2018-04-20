package paquete3;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 *  Ejemplo en el que en lugar de usar clases internas anonimas, usamos una clase adaptador
 */

public class Ejemplo07Adaptador extends JFrame {

	private JButton btnAbrir;
	
	public Ejemplo07Adaptador() {

		super("Prueba de clase adaptador");
		setSize(100, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		btnAbrir = new JButton("Abrir");
		
		btnAbrir.addActionListener(new Adaptador() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Hola", "Hola", JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		
		add(btnAbrir);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo08MouseAdapter ventana = new Ejemplo08MouseAdapter();
	}

}