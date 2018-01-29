package leccion14;

public class CuentaBancaria {
	
	int balance;
	int comision;
	
	CuentaBancaria(int balance){
		 
		this.balance = balance;
		  
	}
	
	public void depositar(int cantidad){
		
		balance = balance + cantidad;
	}
	
	public void depositar(int cantidad, int comision) {
		
		balance = balance + cantidad - comision;
		
	}
	
	 public boolean retirar(int cantidad){
		
		if(cantidad > balance){
			return false;	
		
	}
		balance = balance - cantidad;
		
		return true;
		
	}
	
	public boolean retirar(int cantidad, int comision){
		
		if(cantidad + comision > balance){
			return false;	
		
	}
		balance = balance - cantidad;
		
		return true;
		
	}
	
	public int ObtenerBalance(){
		
		return balance;
		
	}	

}
