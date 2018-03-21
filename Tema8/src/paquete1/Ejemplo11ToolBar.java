package paquete1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JToolBar;

public class Ejemplo11ToolBar extends JFrame {

	public Ejemplo11ToolBar() {

		super("Barra de herramientas");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new BorderLayout());
		
		// Crear barra de herramientas.
		ImageIcon icnNuevo = new ImageIcon("imgs/1.png");
		ImageIcon icnAbrir = new ImageIcon("imgs/52.png");
		ImageIcon icnGuardar = new ImageIcon("imgs/save.gif");
		ImageIcon icnSalir = new ImageIcon("imgs/33.png");
		
		JButton btnNuevo = new JButton(icnNuevo);
		JButton btnAbrir = new JButton(icnAbrir);
		JButton btnGuardar = new JButton(icnGuardar);
		JButton btnSalir = new JButton(icnSalir);
		JToolBar barra = new JToolBar();
		
		barra.add(btnNuevo);
		barra.add(btnAbrir);
		barra.add(btnGuardar);
		barra.addSeparator();
		barra.add(btnSalir);
		
//		add(btnNuevo);
//		add(btnAbrir);
//		add(btnGuardar);
//		add(btnSalir);
		
		JTextArea txtArchivo = new JTextArea();
		txtArchivo.setLineWrap(true);
		txtArchivo.setWrapStyleWord(true);
		JScrollPane panelCuadro = new JScrollPane(txtArchivo);
		txtArchivo.setText("Escribe aqui tu texto...");
		
		
		// Resto de la barra
		
		add(barra, BorderLayout.NORTH);
		add(panelCuadro, BorderLayout.CENTER);

		setVisible(true);
	}

	public static void main(String[] args) {
		
		Ejemplo11ToolBar ventana = new Ejemplo11ToolBar();
		
	}

}
