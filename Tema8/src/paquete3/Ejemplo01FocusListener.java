package paquete3;

import java.awt.FlowLayout;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.math.RoundingMode;
import java.text.DecimalFormat;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Ejemplo01FocusListener extends JFrame implements FocusListener {

	private JTextField txt1;
	private JTextField txt2;
	private JTextField txt3;
	private JLabel lblMedia;
	private double promedio;

	public Ejemplo01FocusListener() {

		super("Titulo");
		setSize(300, 80);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout());

		txt1 = new JTextField("0", 7);
		txt2 = new JTextField("0", 7);
		txt3 = new JTextField("0", 7);
		lblMedia = new JLabel("La media es " + promedio);
		
		txt1.addFocusListener(this);
		txt2.addFocusListener(this);
		txt3.addFocusListener(this);

		add(txt1);
		add(txt2);
		add(txt3);
		add(lblMedia);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo01FocusListener ventana = new Ejemplo01FocusListener();
	}

	@Override
	public void focusGained(FocusEvent e) {
		try {
			double num1 = Double.parseDouble(txt1.getText());
			double num2 = Double.parseDouble(txt2.getText());
			double num3 = Double.parseDouble(txt3.getText());
			
			promedio = (num1 + num2 + num3) / 3;

			lblMedia.setText("La media es " + (double) Math.round(promedio * 100) / 100);
			
		} catch (Exception ex) {
			lblMedia.setText("ERROR!");
		}

	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub

	}

}