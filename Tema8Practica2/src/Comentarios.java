import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Comentarios extends JFrame {
	
	public Comentarios() {
		
		super("Comentarios");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// TextArea
		
		JTextArea txtComentario = new JTextArea(10, 20);
	
		JScrollPane scrPanel = new JScrollPane(txtComentario);
		scrPanel.setPreferredSize(new Dimension(240, 120));
		
		// Label
		
		JLabel lblComentario = new JLabel("Deja un comentario");
		
		// Button
		
		JButton btnEnviar = new JButton("Enviar");
		
		add(lblComentario);
		add(scrPanel);
		add(btnEnviar);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		
		Comentarios ventana = new Comentarios();

	}

}
