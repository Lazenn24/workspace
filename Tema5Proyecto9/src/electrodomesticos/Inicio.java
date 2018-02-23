package electrodomesticos;


public class Inicio {

	public static void main(String[] args) {
		
		Motor m1 = new Motor(1, "Mitsubishi", "V3");
		Motor m2 = new Motor(2, "Samsung", "A1");
		Lavadora l1 = new Lavadora(1, m1, "Balay", 450);
		Lavadora l2 = new Lavadora(2, m2, "Bosch", 500);
		Taller t1 = new Taller();
		
		System.out.println(l1.toString());
		
		t1.addLavadora(l1);
		t1.listaLavadoras();
		t1.borraLavadora(1);
		t1.listaLavadoras();
		t1.addLavadora(l1);
		t1.addLavadora(l2);
		t1.listaLavadoras();
		System.out.println("Esta en la posicion " + t1.buscaLavadora(1));
		
		
		

	}

}
