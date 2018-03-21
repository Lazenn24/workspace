
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Medio medio = new Mp3("Highway to hell", 207, "AC/DC", "Rock", 1);

		medio.reproducir();
		

		((Mp3) medio).guardar();
		
		
		Guardable g1 = new Ogg("Highway to hell", 207, "AC/DC", "Rock", 1);

		
		
		
	}

}
