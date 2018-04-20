package eventos;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ejercicio1 extends JFrame {

	private int total;
	private JLabel lblPrecio;

	public Ejercicio1() {

		super("Viajes Gorrión");
		setSize(200, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setLayout(new FlowLayout(FlowLayout.LEFT));
		
		lblPrecio = new JLabel("Precio total: " + total + "€");
		JLabel lblOpcion = new JLabel("Opciones:");
		
		JCheckBox chkBillete = new JCheckBox("Billetes de avión");
		chkBillete.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(chkBillete.isSelected()){
					total += 120;
				}else {
					total -=120;
				}
				
				lblPrecio.setText("Precio total: " + total + "€");
				
			}
		});
				
		JCheckBox chkTrans = new JCheckBox("Transporte aeropuerto");
		chkTrans.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(chkTrans.isSelected()){
					total += 40;
				}else {
					total -= 40;
				}
				lblPrecio.setText("Precio total: " + total + "€");
				
			}
		});
		
		JCheckBox chkEstancia = new JCheckBox("Estancia en el hotel");
		chkEstancia.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(chkEstancia.isSelected()){
					total += 180;
				}else {
					total -=180;
				}
				lblPrecio.setText("Precio total: " + total + "€");
				
			}
		});
		
		JCheckBox chkPension = new JCheckBox("Pensión completa");
		chkPension.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(chkPension.isSelected()){
					total += 70;
				}else {
					total -=70;
				}
				lblPrecio.setText("Precio total: " + total + "€");
				
			}
		});
		
		
		add(lblOpcion);
		add(chkBillete);
		add(chkTrans);
		add(chkEstancia);
		add(chkPension);
		add(lblPrecio);

		setVisible(true);

	}

	public static void main(String[] args) {
		Ejercicio1 ventana = new Ejercicio1();
	}

}