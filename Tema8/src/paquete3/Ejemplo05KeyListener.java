package paquete3;

import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo05KeyListener extends JFrame {

	private JLabel lblCasa;
	private int x, y;

	public Ejemplo05KeyListener() {

		super("Titulo");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(null);

		lblCasa = new JLabel(new ImageIcon("imgs/17.png"));
		x = 50;
		y = 50;

		lblCasa.setBounds(x, y, 24, 24);

		add(lblCasa);

		addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					y -= 5;
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					y += 5;
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					x -= 5;
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					x += 5;
				}

				if (x > 300) {
					x = 0;
				}
				if (x < 0) {
					x = 300;
				}
				if (y > 200) {
					y = 0;
				}
				if (y < 0) {
					y = 200;
				}

				lblCasa.setBounds(x, y, 24, 24);

			}
		});

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo04KeyListener ventana = new Ejemplo04KeyListener();
	}

}