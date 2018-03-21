package paquete1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class Ejemplo15TabbedPanes extends JFrame {

	public Ejemplo15TabbedPanes() {

		super("Meses del año");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			SwingUtilities.updateComponentTreeUI(this);
			
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
				e.printStackTrace();
		}
		
		// Panel clientes
		JPanel pnlClientes = new JPanel();
		JLabel lblMensaje = new JLabel("Este es el panel de clientes");
		pnlClientes.add(lblMensaje);
		ImageIcon imgClientes = new ImageIcon("imgs/assets/red_dark/mdpi/ic_action_users.png");
		
		// Panel empleados
		JPanel pnlEmpleados = new JPanel();
		JLabel lblMensaje2 = new JLabel("Este es el panel de empleados");
		pnlEmpleados.add(lblMensaje2);
		ImageIcon imgEmpleados = new ImageIcon("imgs/assets/red_dark/mdpi/ic_action_mouse.png");
		
		// Panel de pestañas
		JTabbedPane panelon = new JTabbedPane();
		panelon.addTab("Clientes", imgClientes, pnlClientes);
		panelon.addTab("Empleados", imgEmpleados, pnlEmpleados);
		panelon.setPreferredSize(new Dimension(290,  170));
		
		// Ventana global
		add(panelon);
		
		setVisible(true);
	}

	public static void main(String[] args) {

		Ejemplo15TabbedPanes ventana = new Ejemplo15TabbedPanes();
	}
}

