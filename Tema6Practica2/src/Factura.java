
public class Factura {

	private final int MAX_LINEAS = 100;

	private final int IVA = 21;

	private String empresa;

	private String comprador;

	private Venta[] ventas;

	private int linea;

	public Factura() {

		ventas = new Venta[MAX_LINEAS];

		linea = 0;
	}

	public void addVenta(Venta venta) {

		for (int i = 0; i < MAX_LINEAS; i++) {
			ventas[linea] = venta;
			linea++;
			break;

		}
	}

	public void imprimir() {
		
		float total = 0;
		
		System.out.println(empresa);
		
		System.out.println("Cliente: " + comprador);
		System.out.println("Fecha de compra: 20 de febrero de 2018");
		
		System.out.printf("%-25s %4s %11s %11s\n" ,"Artículo", "Uds", "P/Ud", "Total");
		System.out.printf("%-25s %4s %11s %11s\n" , "========================", "====", "==========", "==========");
		
		for (int i = 0; i < MAX_LINEAS; i++) {
			if(ventas[i] != null) {
				System.out.printf("%-25s %4d %11.2f %11.2f\n" ,ventas[i].getArticulo().getNombre(),
				ventas[i].uds(), ventas[i].getArticulo().getPud(), ventas[i].uds() * ventas[i].getArticulo().getPud());
			}
			
		}
		
		System.out.printf();

	}

	public boolean facturaVacia() {

		return false;
	}

}
