package paquete1;

import java.awt.*;

import javax.swing.*;

public class Ejemplo08LookAndFeel extends JFrame {

	public Ejemplo08LookAndFeel() {

		super("Comentarios");
		setSize(400, 370);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout());
		
		try {
		UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		SwingUtilities.updateComponentTreeUI(this);
		
		} catch(Exception e) {
			System.out.println("Error al aplicar el look and feel: " + e.getMessage());
		}
		

		JTextArea txtComentarios = new JTextArea(10, 20);
		txtComentarios.setLineWrap(true);
		txtComentarios.setWrapStyleWord(true);
		
		
		JScrollPane scrPanel = new JScrollPane(txtComentarios);
		scrPanel.setPreferredSize(new Dimension(390, 270));
	
		
		JComboBox<String> cmbOpciones = new JComboBox<>();
		cmbOpciones.addItem("Comentario");
		cmbOpciones.addItem("Pregunta");
		cmbOpciones.addItem("Sugerencia");
		cmbOpciones.setPreferredSize(new Dimension(390, 22));	
		
		JButton btnAceptar = new JButton("Aceptar");
		JButton btnCancelar = new JButton("Cancelar");
		
		
		add(new JLabel("Escribe aqui tus comentarios"));
		add(scrPanel);
		add(cmbOpciones);
		add(btnAceptar);
		add(btnCancelar);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Ejemplo08LookAndFeel ventana = new Ejemplo08LookAndFeel();
	}
}
