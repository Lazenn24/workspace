

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MuerteSegura extends JFrame{

	public MuerteSegura() {
		
		super("titulo");
		//setSize(300,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		

		JLabel error = new JLabel("¡¡¡ ERROR !!!");
		
		this.setLocation((int) (Math.random()*1800+1), (int) (Math.random()*900+1));
		add(error);

		
		pack();
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		while(true) {
		MuerteSegura ventana = new MuerteSegura();	
		}
		
	}

}