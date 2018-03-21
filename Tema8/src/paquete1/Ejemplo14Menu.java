package paquete1;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo14Menu extends JFrame {

	public Ejemplo14Menu() {

		super("Meses del año");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// Cambio de look and feel
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
			SwingUtilities.updateComponentTreeUI(this);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
				e.printStackTrace();
		}
		
		// Barra de menú
		JMenuBar barra = new JMenuBar();
		
		// Menú File
		JMenu mnuFile = new JMenu("File");
		JMenuItem itemNew = new JMenuItem("New");
		JMenuItem itemOpenFile = new JMenuItem("Open file");
		JMenuItem itemClose = new JMenuItem("Close");
		
		mnuFile.add(itemNew);
		mnuFile.add(itemOpenFile);
		mnuFile.addSeparator();
		mnuFile.add(itemClose);
		
		// Menú Edit
		JMenu mnuEdit = new JMenu("Edit");
		JMenuItem itemUndo = new JMenuItem("Undo typing");
		JMenuItem itemRedo = new JMenuItem("Redo");
		JMenuItem itemCut = new JMenuItem("Cut");
		JMenuItem itemCopy = new JMenuItem("Copy");
		JMenuItem itemPaste = new JMenuItem("Paste");
		
		mnuEdit.add(itemUndo);
		mnuEdit.add(itemRedo);
		mnuEdit.addSeparator();
		mnuEdit.add(itemCut);
		mnuEdit.add(itemCopy);
		mnuEdit.add(itemPaste);
		
		barra.add(mnuFile);
		barra.add(mnuEdit);
		
		setJMenuBar(barra);
		
		
		setVisible(true);
	}

	public static void main(String[] args) {

		Ejemplo14Menu ventana = new Ejemplo14Menu();
	}
}
