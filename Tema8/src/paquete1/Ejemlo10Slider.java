package paquete1;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;

public class Ejemlo10Slider extends JFrame{
	
	public Ejemlo10Slider() {
		
		super("Meses del año");
		setSize(300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JSlider sldBrillo = new JSlider(SwingConstants.HORIZONTAL);
		sldBrillo.setMinimum(0);
		sldBrillo.setMaximum(100);
		sldBrillo.setValue(80);
		
		sldBrillo.setMajorTickSpacing(20);
		sldBrillo.setMinorTickSpacing(5);
		sldBrillo.setPaintTicks(true);
		sldBrillo.setPaintLabels(true);
		
		sldBrillo.setPreferredSize(new Dimension(200, 50));
		
		add(sldBrillo);
		
		setVisible(true);
		
		for (int i = 0; i < 100; i++) {
			sldBrillo.setValue(i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Ejemlo10Slider ventana = new Ejemlo10Slider();
		
	}
	
	

}

