
public class Musica extends Medio {
	
	private String artista;
	
	private String estilo;
	
	
public Musica(String nombre, double duracion, String artista, String estilo){
		
		super(nombre, duracion);
		
		this.artista = artista;
		
		this.estilo = estilo;
	}
	
	@Override
	public void reproducir(){
		System.out.println("Reproduciendo...");
		
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}
	
	

}
