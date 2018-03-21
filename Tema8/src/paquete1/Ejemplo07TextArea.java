package paquete1;

import java.awt.*;

import javax.swing.*;

public class Ejemplo07TextArea extends JFrame {

	public Ejemplo07TextArea() {

		super("Comentarios");
		setSize(400, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		

		JTextArea txtComentarios = new JTextArea(10, 20);
		
		txtComentarios.setLineWrap(true);
		txtComentarios.setWrapStyleWord(true);
		
		add(new JLabel("Escribe aqui tus comentarios"));
		add(txtComentarios);
		
		
		JScrollPane scrPanel = new JScrollPane(txtComentarios);
		scrPanel.setPreferredSize(new Dimension(290, 300));
		
		add(scrPanel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Ejemplo07TextArea ventana = new Ejemplo07TextArea();
	}
}
