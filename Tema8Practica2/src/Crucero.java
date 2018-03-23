import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;

public class Crucero extends JFrame {
	
	public Crucero() {
		
		super("Velocidad de crucero");
		setSize(300, 70);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		// Slider
		JSlider sldVelocidad = new JSlider();
		sldVelocidad.setMaximum(110);;
		sldVelocidad.setMinimum(10);;
		sldVelocidad.setValue(90);
		
		sldVelocidad.setMajorTickSpacing(20);
		sldVelocidad.setMinorTickSpacing(5);
		sldVelocidad.setPaintTicks(true);
		sldVelocidad.setPaintLabels(true);
		
		sldVelocidad.setPreferredSize(new Dimension(290, 50));
		
		add(sldVelocidad);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		Crucero ventana = new Crucero();

	}

}
