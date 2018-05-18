package eventos;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Ejercicio2 extends JFrame {

	private JSlider sldRojo, sldVerde, sldAzul;

	private JTextField txtHex;

	private String hex;

	public Ejercicio2() {

		super("Paleta");
		setSize(220, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		sldRojo = new JSlider();
		sldRojo.setMaximum(255);
		sldRojo.setMinimum(0);
		sldRojo.setValue(250);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);

		sldVerde = new JSlider();
		sldVerde.setMaximum(255);
		sldVerde.setMinimum(0);
		sldVerde.setValue(200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);

		sldAzul = new JSlider();
		sldAzul.setMaximum(255);
		sldAzul.setMinimum(0);
		sldAzul.setValue(50);
		sldAzul.setMajorTickSpacing(50);
		sldAzul.setMinorTickSpacing(25);
		sldAzul.setPaintTicks(true);
		sldAzul.setPaintLabels(true);

		JLabel lblRojo = new JLabel("Rojo");
		JLabel lblVerde = new JLabel("Verde");
		JLabel lblAzul = new JLabel("Azul");

		JButton btnColor = new JButton();
		btnColor.setPreferredSize(new Dimension(100, 30));

		txtHex = new JTextField(7);

		sldRojo.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
				actualizaHex();

			}
		});

		sldVerde.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
				actualizaHex();
			}
		});

		sldAzul.addChangeListener(new ChangeListener() {

			@Override
			public void stateChanged(ChangeEvent e) {
				btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
				actualizaHex();
			}
		});

		add(lblRojo);
		add(sldRojo);
		add(lblVerde);
		add(sldVerde);
		add(lblAzul);
		add(sldAzul);
		add(btnColor);
		add(txtHex);

		setVisible(true);

	}

	/**
	 * Convierte un número decimal entre 0 y 9 a cifra hexadecimal
	 * 
	 * @param num
	 *            Num 0 y 15
	 * @return Cifra hexadecimal
	 */
	private String aHex(int num) {

		String hex = "";

		while (num != 0) {
			int resto = num % 16;
			hex = cifraHex(resto) + hex;
			num /= 16;
		}
		if (hex.length() == 1) {
			hex = "0" + hex;
		}else if(hex.length() == 0) {
			hex = "00";
		}

		return hex;

	}

	/**
	 * Pasa una mayor o igual a 10 a hexadecimal
	 * 
	 * @param num
	 * @return Cifra hexadecimal
	 */
	private String cifraHex(int num) {

		if (num < 0 || num > 15) {
			return "ERROR";
		}
		String[] letras = { "A", "B", "C", "D", "E", "F" };

		if (num < 10) {
			return "" + num;
		}

		return letras[num - 10];

	}

	private void actualizaHex() {

		hex = "#" + aHex(sldRojo.getValue()) + aHex(sldVerde.getValue()) + aHex(sldAzul.getValue());
		txtHex.setText(hex);
	}

	public static void main(String[] args) {
		Ejercicio2 ventana = new Ejercicio2();
	}

}