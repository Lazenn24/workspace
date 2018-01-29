package leccion11;

public class Main {

	public static void main(String[] args) {

		Coche c1 = new Coche("Seat", "Leon", "rojo", "1234CFD", 12000f);
		Coche c2 = new Coche("Opel", "Corsa", "blanco", "1698JPC", 11000f);

		c1.setDescuento(15);

		System.out.println("Descuento de c1 " + c1.getDescuento());
		System.out.println("Descuento de c2: " + c2.getDescuento());

		System.out.println("Cambiamos de nuevo el descuento...");
		c2.setDescuento(10);

		System.out.println("Descuento de c1: " + c1.getDescuento());
		System.out.println("Descuento de c2: " + c2.getDescuento());

	}
}
