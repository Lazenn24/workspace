
public class App {
	
	public static void main(String[] args) {
		
		// Medio me1 = new Medio(); Da error, porque no se puede crear un objeto a
		// partir de una clase abstracta.
		
		
		Medio m1 = new Mp3("asdf", 1.60, "fdsa", "ghjk", 2);
		
		m1.reproducir();
		
		((Mp3) m1).guardar();
		
		
		
	}

}
