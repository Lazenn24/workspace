
public class Mp3 extends Musica implements Guardable{
	
	private int modo;
	

	
	public Mp3(String nombre, double duracion, String artista, String estilo, int modo){
		
		super(nombre, duracion, artista, estilo);
		
		this.modo = modo;
		
	}
	
	
	public boolean guardar() {
		System.out.println("Guardando...");
		return true;
	}
	
	public int getModo() {
		return modo;
	}

	public void setModo(int modo) {
		this.modo = modo;
	}


	
	

}
