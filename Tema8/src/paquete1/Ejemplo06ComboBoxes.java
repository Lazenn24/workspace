package paquete1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo06ComboBoxes extends JFrame{

	public Ejemplo06ComboBoxes() {
		
		super("Meses del año");
		setSize(225, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JLabel lblMeses = new JLabel("Elige tu mes de nacimiento");
		
		JComboBox<String> cmbMeses = new JComboBox<>();
		
		add(lblMeses);
		cmbMeses.addItem("Enero");
		cmbMeses.addItem("Febrero");
		cmbMeses.addItem("Marzo");
		cmbMeses.addItem("Abril");
		cmbMeses.addItem("Mayo");
		cmbMeses.addItem("Junio");
		cmbMeses.addItem("Julio");
		cmbMeses.addItem("Agosto");
		cmbMeses.addItem("Septiembre");
		cmbMeses.addItem("Octubre");
		cmbMeses.addItem("Noviembre");
		cmbMeses.addItem("Diciembre");
		
		
		cmbMeses.setPreferredSize(new Dimension(200, 20));
		
		add(cmbMeses);
		
		setVisible(true);
	}
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		Ejemplo06ComboBoxes ventana = new Ejemplo06ComboBoxes();

	}

}
