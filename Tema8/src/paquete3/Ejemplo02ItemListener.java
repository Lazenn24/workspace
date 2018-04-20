package paquete3;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo02ItemListener extends JFrame implements ItemListener {

	private JComboBox<String> cmbPeliculas;
	private JLabel lblProtagonista;
	private String[] protagonista = { "Daniel Radcliffe", "Keanu Reeves", "Mel Gibson", "Brad Pitt" };

	public Ejemplo02ItemListener() {

		super("Películas y actores");
		setSize(350, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		String[] peliculas = { "Harry Potter", "Matrix", "Mad Max", "Malditos bastardos" };
		cmbPeliculas = new JComboBox<>(peliculas);
		cmbPeliculas.addItemListener(this);

		lblProtagonista = new JLabel("Protagonista: " + protagonista[0]);

		add(cmbPeliculas);
		add(lblProtagonista);
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo02ItemListener ventana = new Ejemplo02ItemListener();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {

		JComboBox<String> cmbCombo = (JComboBox<String>) e.getSource();

		int pos = cmbCombo.getSelectedIndex();

		lblProtagonista.setText("Protagonista: " + protagonista[pos]);

	}

}