package paquete2;

import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Ejemplo02BoxLayout extends JFrame {

	public Ejemplo02BoxLayout() {

		super("Titulo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new BoxLayout(this.getContentPane(), BoxLayout.X_AXIS));
		
		JButton btn1 = new JButton("Botón 1");
		JButton btn2 = new JButton("Botón 2");
		JButton btn3 = new JButton("Botón 3");
		JButton btn4 = new JButton("Botón 4");
		JButton btn5 = new JButton("Botón 5");
		JButton btn6 = new JButton("Botón 6");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo03GridLayout ventana = new Ejemplo03GridLayout();
	}

}
