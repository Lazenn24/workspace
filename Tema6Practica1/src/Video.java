
public class Video extends Medio {
	
	private String director;
	
	private String idioma;
	
	public Video(){
		
	}
	
	public Video(String nombre, double duracion, String director, String idioma){
		
		super(nombre, duracion);
		
		this.director = director;
		
		this.idioma = idioma;
	}
	
	public void reproducir(){
		
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	

}
