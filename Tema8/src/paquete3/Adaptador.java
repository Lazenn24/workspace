package paquete3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class Adaptador implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
	
		JOptionPane.showMessageDialog(null, "Hola", "Hola", JOptionPane.INFORMATION_MESSAGE);
		
	}

	
	
}
