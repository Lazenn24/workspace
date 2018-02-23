package ejemplo2;

public class App {

	public static void main(String[] args) {
		
		Camion c1 = new Camion("23543621", "rethet", "ehrewh", 3565, 2);
		Automovil a1 = new Automovil("23543621", "rethet", "ehrewh", 3565, 2);
		Furgoneta f1 = new Furgoneta("23543621", "rethet", "ehrewh", 3565, 2, 4);
		
		
		c1.mostrar();
		a1.mostrar();
		f1.mostrar();

	}

}
