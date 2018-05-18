import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ejemplo13FileChooser extends JFrame implements ActionListener {

	private JButton btnAbrir, btnGuardar;
	private File archivo;

	public Ejemplo13FileChooser() {

		super("File Chooser");
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		btnAbrir = new JButton("Abrir");
		btnAbrir.addActionListener(this);

		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(this);

		add(btnAbrir);
		add(btnGuardar);

		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		new Ejemplo13FileChooser();

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == btnAbrir) {
			abrir();
		} else {
			guardar();
		}

	}

	/**
	 * Muestra una ventana para que el usuario elija
	 * que archivo quiere abrir.
	 */
	private void abrir() {
		
		JFileChooser eleccionArchivo = new JFileChooser();
		
		int respuesta = eleccionArchivo.showOpenDialog(null);
		
		if (respuesta == JFileChooser.APPROVE_OPTION) {
			
			archivo = eleccionArchivo.getSelectedFile();
			
			JOptionPane.showMessageDialog(null, "Has elegido el archivo " + archivo.toString(), "File Chooser", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Has salido sin elegir nada", "File Chooser", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Has cancelado sin elegir nada.");
		}
	}

	/**
	 * Muestra una ventana para que el usuario elija que archivo quiere guardar.
	 */
	private void guardar() {
		
		JFileChooser eleccionArchivo = new JFileChooser();
		
		int respuesta = eleccionArchivo.showSaveDialog(null);
		
		if(respuesta == JFileChooser.APPROVE_OPTION) {
			
			archivo = eleccionArchivo.getSelectedFile();
			
			JOptionPane.showMessageDialog(null, "Has guardado el archivo " + archivo.toString(), "File Chooser", JOptionPane.INFORMATION_MESSAGE);
			
		}else {
			
			JOptionPane.showMessageDialog(null, "Has salido sin elegir nada", "File Chooser", JOptionPane.INFORMATION_MESSAGE);
			System.out.println("Has cancelado sin elegir nada.");
		}
	}

}
