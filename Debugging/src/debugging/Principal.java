package debugging;

import java.util.logging.Logger;

public class Principal {
	
	static Logger logger = Logger.getAnonymousLogger();
	
	public static void main(String[] args) {
		
		logger.info("Entrando en aplicación");
		
		logger.info("Configurando el property");
		
		Algorritmos alg = new Algorritmos();
		
		alg.cuantosDigitos();
		
		
		
		
		
	}

}
