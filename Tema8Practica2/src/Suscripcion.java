import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Suscripcion extends JFrame{
	
	public Suscripcion() {
	
		super("Suscripción");
		setSize(260, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		// Label
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblEmail = new JLabel("Email");
		JLabel lblMotivo = new JLabel("Motivo por el que te suscribes");
		
		// TextField
		JTextField txtNombre = new JTextField(20);
		JTextField  txtEmail = new JTextField(20);
		
		// TextArea
		
		JTextArea txtMotivo = new JTextArea(5, 19);
		
		JScrollPane scrPanel = new JScrollPane(txtMotivo);
		scrPanel.setPreferredSize(new Dimension(220, 100));
		
		// CheckBox
		
		JCheckBox chkInfo = new JCheckBox("Recibir información por correo", true);
		
		// Button
		
		JButton btnEnviar = new JButton("Enviar");
		
		add(lblNombre);
		add(txtNombre);
		add(lblEmail);
		add(txtEmail);
		add(lblMotivo);
		add(scrPanel);
		add(chkInfo);
		add(btnEnviar);
		
		setVisible(true);
		
	}
	

	public static void main(String[] args) {
		Suscripcion ventana = new Suscripcion();

	}

}
