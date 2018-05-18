import java.awt.FlowLayout;

import javax.swing.JFrame;

public class Plantilla extends JFrame {

	public Plantilla() {

		super("Titulo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		setVisible(true);

	}

	public static void main(String[] args) {
		Plantilla ventana = new Plantilla();
	}

}
