package paquete3;

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejemplo06MouseListener extends JFrame implements MouseListener {
	
	private JLabel lblCoordenadas, lblBoton;

	public Ejemplo06MouseListener() {

		super("Coordenadas raton");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		lblCoordenadas = new JLabel("Haz click en la ventana");
		lblBoton = new JLabel();
		
		add(lblCoordenadas);
		add(lblBoton);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));

		addMouseListener(this);
		
		
		setVisible(true);

	}

	public static void main(String[] args) {
		Ejemplo06MouseListener ventana = new Ejemplo06MouseListener();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
		int x, y;
		x = e.getX();
		y = e.getY();
		
		lblCoordenadas.setText("Coordenadas: (" + x + ", " + y + ")");
		lblBoton.setText("Botón: " + e.getButton());
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// No utilizamos este metodo
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// No utilizamos este metodo
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// No utilizamos este metodo
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// No utilizamos este metodo
		
	}

}