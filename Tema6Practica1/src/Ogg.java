
public class Ogg extends Musica {
	
	private int version;
	
	public Ogg(){
		
	}
	
	public Ogg(String nombre, double duracion, String artista, String estilo, int version){
		
		super(nombre, duracion, artista, estilo);
		
		this.version = version;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}
	
	

}
