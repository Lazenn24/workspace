
public class App {
	
	public static void main(String[] args) {
		
		Articulo a1 = new Articulo("HP Envy", 750);
		
		Articulo a2 = new Articulo("Cable USB 3m", 8);
		
		Articulo a3 = new Articulo("Telefono móvil Xiaomi", 215);
		
		Venta v1 = new Venta(a1, 1);
		
		Venta v2 = new Venta(a2, 2);
		
		Venta v3 = new Venta(a3, 1);
		
		Venta v4 = new Venta(a3, 1);
		
		Factura f1 = new Factura();
		
		f1.addVenta(v1);
		
		f1.addVenta(v2);
		
		f1.addVenta(v3);
		
		f1.addVenta(v4);
		
		f1.imprimir();
		
		
		
	}

}
