
public abstract class Medio {
	
	private String nombre;
	
	private double duracion;
	

	public Medio(String nombre, double duracion){
		
		this.nombre = nombre;
		
		this.duracion = duracion;
	}
	
	public abstract void reproducir();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	
	

}
