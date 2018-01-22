package leccion08;

public class Main {
		
	public static void main(String[] args) {
		
		CuentaBancaria miCuenta = new CuentaBancaria(5000);
		System.out.println("Estado de la cuenta: " + miCuenta.ObtenerBalance());
		
		miCuenta.depositar(178);
		System.out.println("Estado de la cuenta: " + miCuenta.ObtenerBalance());
		
		boolean resultado = miCuenta.retirar(6000);
		
		if (!resultado){
			System.out.println("No se ha podido efectuar la operación");
		}
		System.out.println("Estado de la cuenta: " + miCuenta.ObtenerBalance());
		
		
		
		
		
		
		
	}

}
