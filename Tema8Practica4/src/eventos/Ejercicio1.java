package eventos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class Ejercicio1 extends JFrame{
	
	private JButton btnPeli1;
	private JButton btnPeli2;
	private JButton btnPeli3;
	private JButton btnPeli4;
	private JLabel lblPeli;
	
	
	public Ejercicio1() {
		
		super("Fotogramas");
		setSize(600, 570);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		
		JPanel pnlPeli = new JPanel();
		
		btnPeli1 = new JButton("Black rain");
		btnPeli2 = new JButton("El caso Winslow");
		btnPeli3 = new JButton("Asalto al distrito 13");
		btnPeli4 = new JButton("Blade runner");
		
		btnPeli1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPeli.setIcon(new ImageIcon("imgs/blackRain.jpg"));
				
			}
		});
		
		btnPeli2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPeli.setIcon(new ImageIcon("imgs/el caso winslow.jpg"));
				
			}
		});
		
		btnPeli3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPeli.setIcon(new ImageIcon("imgs/Asalto-al-distrito-13-314-E1.jpg"));
				
			}
		});
		
		btnPeli4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				lblPeli.setIcon(new ImageIcon("imgs/bladeRunner"));
				
			}
		});
		
		lblPeli = new JLabel(new ImageIcon("imgs/blackRain.jpg"));
		
		
		add(lblPeli, BorderLayout.CENTER);
		pnlPeli.add(btnPeli1);
		pnlPeli.add(btnPeli2);
		pnlPeli.add(btnPeli3);
		pnlPeli.add(btnPeli4);
		
		add(pnlPeli, BorderLayout.NORTH);
		
		
		
		
		
		setVisible(true);
	}

	public static void main(String[] args) {
		Ejercicio1 ventana = new Ejercicio1();

	}

}