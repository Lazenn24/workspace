package paquete2;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;

public class Ejemplo10CompoundBorder extends JFrame {

	public Ejemplo10CompoundBorder() {

		super("Titulo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel pnl = (JPanel) this.getContentPane();
		
		
		
		Border borde1 = BorderFactory.createTitledBorder("Controles");
		Border borde2 = BorderFactory.createLineBorder(new Color(204, 153, 0));
		Border borde3 = BorderFactory.createEmptyBorder(20, 20, 0, 0);
		
		// Agruptamos los dos primeros bordes.
		CompoundBorder bordeCompuesto = BorderFactory.createCompoundBorder(borde3, borde1);
		
		// Borde triple
		pnl.setBorder(BorderFactory.createCompoundBorder(bordeCompuesto, borde2));
		
		JButton btn1 = new JButton("Acción 1");
		JButton btn2 = new JButton("Acción 2");
		JButton btn3 = new JButton("Acción 3");
		
		add(btn1);
		add(btn2);
		add(btn3);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo10CompoundBorder ventana = new Ejemplo10CompoundBorder();
	}

}
