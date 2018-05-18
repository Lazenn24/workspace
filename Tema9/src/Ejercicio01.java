import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Ejercicio01 extends JFrame {

	private JLabel lblArchivo = new JLabel("Archivo");
	private JTextField txtArchivo = new JTextField();

	private JButton btnEncriptar = new JButton("Encriptar");
	private JButton btnDesencriptar = new JButton("Desencriptar");

	private JTextArea txtMuestra = new JTextArea(10, 16);

	public Ejercicio01() {

		super("Encriptador");
		setSize(200, 300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.CENTER));

		txtMuestra.setLineWrap(true);
		JScrollPane scrMostrar = new JScrollPane(txtMuestra);

		txtArchivo.setPreferredSize(new Dimension(180, 25));
		btnEncriptar.setPreferredSize(new Dimension(180, 25));
		btnDesencriptar.setPreferredSize(new Dimension(180, 25));

		btnEncriptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				try {

					FileInputStream entrada = 
							new FileInputStream
							("ficheros/" + txtArchivo.getText());

					FileOutputStream salida = 
							new FileOutputStream
							("ficheros/" + nombreCopia(txtArchivo.getText())); //

					boolean eof = false;
					int byteLeido = 0;
					while (!eof) {
						byteLeido = entrada.read();
						if (byteLeido == -1) {
							eof = true;
						} else {
							salida.write(byteLeido + 1);
						}
					}

					entrada.close();

				} catch (IOException ioe) {
					JOptionPane.showMessageDialog(null, 
							"Error de E/S",
							"Error crítico", 
							JOptionPane.ERROR_MESSAGE);
				}

			}

		});

		btnDesencriptar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {

					FileInputStream encriptado = 
							new FileInputStream
							("ficheros/" + txtArchivo.getText());
					
					String extension = txtArchivo.getText().substring
							(txtArchivo.getText().length() - 3,
							txtArchivo.getText().length());

					boolean eof = false;
					int byteLeido = 0;
					char caracter;
					String archivo = "";

					if (!extension.equals("txt")) {
						
						String nombreArchivoDesencriptado = 
								JOptionPane.showInputDialog(null, 
										"No es un archivo de texto. "
										+ "¿Con qué nombre desea guardar la copia "
										+ "desencriptada?", "Archivo binario", 
										JOptionPane.QUESTION_MESSAGE);
						
						FileOutputStream desencriptado = 
								new FileOutputStream(nombreArchivoDesencriptado);
						
						while (!eof) {

							byteLeido = encriptado.read();

							if (byteLeido == -1) {
								eof = true;
							} else {
								desencriptado.write(byteLeido - 1);
							}
						}
						
						txtMuestra.setText("Se ha desencriptado correctamente");

						desencriptado.close();

					} else {
						// Como el archivo es .txt, mostramos el contenido en
						// el TextArea.
						while (!eof) {

							byteLeido = encriptado.read();

							if (byteLeido == -1) {
								eof = true;
							} else {
								caracter = (char) (byteLeido - 1);
								archivo = archivo + caracter;
								txtMuestra.setText(archivo);
							}
						}
					}

					encriptado.close();

				} catch (IOException ioe) {
					System.out.println("fichero no encontrado");
				}
			}
		});

		add(lblArchivo);
		add(txtArchivo);
		add(btnEncriptar);
		add(btnDesencriptar);
		add(scrMostrar);

		setVisible(true);

		nombreCopia("hola.doc");
	}

	private String nombreCopia(String nombreOriginal) {

		// Posición del punto antes de la extensión.
		int posPunto = nombreOriginal.lastIndexOf(".");

		// Nombre del archivo quitándole la extensión.
		String nombreSinExtension = 
				nombreOriginal.substring(0, posPunto);
		nombreSinExtension = nombreSinExtension + "_copia";

		// Extensión del archivo.
		String extension = 
				nombreOriginal.substring
				(posPunto, nombreOriginal.length());

		// Nombre nuevo.
		return nombreSinExtension + extension;

	}

	public static void main(String[] args) {

		Ejercicio01 ventana = new Ejercicio01();

	}

}