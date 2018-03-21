
public class Video extends Medio {

	private String director;

	private String idioma;

	public Video(String nombre, double duracion, String director, String idioma) {

		super(nombre, duracion);

		this.director = director;

		this.idioma = idioma;
	}

	@Override
	public void reproducir() {
		System.out.println("Reproduciendo...");

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
