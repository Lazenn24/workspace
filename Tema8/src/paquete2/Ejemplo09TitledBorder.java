package paquete2;

import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ejemplo09TitledBorder extends JFrame {

	public Ejemplo09TitledBorder() {

		super("Titulo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JPanel pnl = (JPanel) this.getContentPane();
		
		pnl.setBorder(BorderFactory.createTitledBorder("Controles"));
		
		JButton btn1 = new JButton("Acción 1");
		JButton btn2 = new JButton("Acción 2");
		JButton btn3 = new JButton("Acción 3");
		
		add(btn1);
		add(btn2);
		add(btn3);
		

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo09TitledBorder ventana = new Ejemplo09TitledBorder();
	}

}
