package leccion11;

public class Coche {

	private String marca;

	private String modelo;

	private String color;

	private String matricula;

	private float precio;

	private static float descuento;

	// Constructor con todos los parámetros.

	public Coche(String marca, String modelo, String color, String matricula,
			float precio) {

		this.marca = marca;

		this.modelo = modelo;

		this.color = color;

		this.matricula = matricula;

		this.precio = precio;

	}

	// Métodos

	public void arrancar() {

		System.out.println("Arrancando...");

	}

	public void detenerse() {

		System.out.println("Deteniendose...");

	}

	public void acelerar() {

		System.out.println("Acelerando...");

	}

	public void frenar() {

		System.out.println("Frenando...");

	}

	public float verPrecio() {

		return precio - precio * descuento / 100;
	}

	// Getters y setters
	
	public float getDescuento(){
		
		return descuento;
		
	}

	public void setDescuento(float descuento) {

		this.descuento = descuento;

	}

}
