package eventos;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejercicio2 extends JFrame{
	
	private JLabel lblCurso;
	
	public Ejercicio2() {
		
		super("Matrícula");
		setSize(220, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblApellidos = new JLabel("Apellidos");
		JLabel lblNombre = new JLabel("Nombre");
		JLabel lblCurso = new JLabel("Curso");
		JLabel lblCmb = new JLabel("");
		JTextField txtApellidos = new JTextField(18);
		JTextField txtNombre = new JTextField(18);
		
		String cursos[] = {"1º ESO", "2º ESO", "3º ESO", "4º ESO"};
		JComboBox<String> cmbCurso = new JComboBox<>(cursos);
		
		cmbCurso.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JComboBox<String> cmbCombo = (JComboBox<String>)e.getSource();
				int pos = cmbCombo.getSelectedIndex();
				
				lblCmb.setText("Curso: " + cursos[pos]);
				
			}
		});
		
		add(lblApellidos);
		add(txtApellidos);
		add(lblNombre);
		add(txtNombre);
		add(lblCurso);
		add(cmbCurso);
		add(lblCmb);
		
		
		
		
		
		
		
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio2 ventana = new Ejercicio2();

	}

}