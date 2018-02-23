
public class Venta {
	
	private Articulo articulo;
	
	private int uds;
	
	public Venta(Articulo articulo, int uds) {
		
		this.articulo = articulo;
		
		this.uds = uds;
	}
	
	public String nombre() {
		
		String compra = "El artículo a comprar es " + articulo.getNombre(); 
		
		return compra;
	
	}
	
	public double pud() {
		
		return articulo.getPud();
	}
	
	public int uds() {
		
		return uds;
	}

	public Articulo getArticulo() {
		return articulo;
	}

	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	
	
	
	
	

}
