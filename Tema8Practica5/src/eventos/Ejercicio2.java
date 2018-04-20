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

	public Ejercicio2() {

		super("Paleta");
		setSize(220, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));
		
		JSlider sldRojo = new JSlider();
		sldRojo.setMaximum(250);
		sldRojo.setMinimum(0);
		sldRojo.setValue(250);
		sldRojo.setMajorTickSpacing(50);
		sldRojo.setMinorTickSpacing(25);
		sldRojo.setPaintTicks(true);
		sldRojo.setPaintLabels(true);
		
		
		JSlider sldVerde = new JSlider();
		sldVerde.setMaximum(250);
		sldVerde.setMinimum(0);
		sldVerde.setValue(200);
		sldVerde.setMajorTickSpacing(50);
		sldVerde.setMinorTickSpacing(25);
		sldVerde.setPaintTicks(true);
		sldVerde.setPaintLabels(true);
		
		
		JSlider sldAzul = new JSlider();
		sldAzul.setMaximum(250);
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
		
		
		JTextField txtHex = new JTextField(7);
		
		sldRojo.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
				
			}
		});
		
		sldVerde.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
				
			}
		});
		
		sldAzul.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				btnColor.setBackground(new Color(sldRojo.getValue(), sldVerde.getValue(), sldAzul.getValue()));
				
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

	public static void main(String[] args) {
		Ejercicio2 ventana = new Ejercicio2();
	}

}