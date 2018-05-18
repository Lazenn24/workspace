import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class Ejercicio02 extends JFrame {

	private JTextArea txtLector = new JTextArea(20, 50);
	private JMenuItem itmAbrir;
	private File archivo;

	public Ejercicio02() {

		super("Lector");
		setSize(560, 330);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));

		JMenuBar barra = new JMenuBar();
		JMenu mnuArchivo = new JMenu("Archivo");
		itmAbrir = new JMenuItem("Abrir");

		itmAbrir.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser eleccionArchivo = new JFileChooser();

				int respuesta = eleccionArchivo.showOpenDialog(null);

				if (respuesta == eleccionArchivo.APPROVE_OPTION) {

					try {
						
					archivo = eleccionArchivo.getSelectedFile();

					
						FileReader fr = new FileReader(archivo);
						BufferedReader br = new BufferedReader(fr);
						String linea = "";

						boolean eof = false;

						while (!eof) {
							linea = br.readLine();
							if (linea == null) {
								eof = true;
							} else {
								System.out.println(linea);
								txtLector.setText(linea);

							}
						}
					} catch (IOException ioe) {
						// TODO Auto-generated catch block
						ioe.printStackTrace();
					}

				}

			}
		});

		mnuArchivo.add(itmAbrir);
		barra.add(mnuArchivo);

		setJMenuBar(barra);

		add(txtLector);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejercicio02 ventana = new Ejercicio02();
	}

}
