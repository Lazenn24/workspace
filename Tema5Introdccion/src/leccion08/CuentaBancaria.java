package leccion08;

public class CuentaBancaria {
	
	int balance;
	
	CuentaBancaria(int balance){
		 
		this.balance = balance;
		  
	}
	
	void depositar(int cantidad){
		
		balance = balance + cantidad;
	}
	
	boolean retirar(int cantidad){
		
		if(cantidad > balance){
			return false;	
		
	}
		balance = balance - cantidad;
		
		return true;
		
	}
	
	int ObtenerBalance(){
		
		return balance;
		
	}
	
	

}
