package ejemplo3;

public class Pruebas {

	public static void main(String[] args) {
		
//		Cliente cliente = new Cliente();
//		cliente.setDni("43986719D");
//		cliente.setApellidos("Sanchez Martinez");
//		cliente.setNombre("Juan");		
//		cliente.setVisa("7218-8956-2367-1985");
//		
//		Empleado empleado = new Empleado();
//		
//		empleado.setDni("67890263F");
//		empleado.setApellidos("Gomez Perez");
//		empleado.setNombre("Andres");
//		empleado.setNumEmpleado(33491);
//		
//
//		
//		
//		
//		System.out.println("Mostrando los datos de un cliente");
//		cliente.mostrar();
//		System.out.println("--------------------------------");
//		System.out.println("Mostrando los datos de un empleado");
//		empleado.mostrar();
		
//		Persona p1 = new Persona();
		
		Persona p2 = new Cliente("24678901F", "Martinez", "Oscar", "7892-4589-2351-9029");
		Persona p3 = new Empleado("24678901F", "Lopez", "Juan", 76164);
		
		p2.mostrar();
		System.out.println("=====================================");
		p3.mostrar();
		((Cliente)p2).saluda();
		
		System.out.println("Comprobamos si p2 y p3 son la misma persona...");
		System.out.println(p2.equals(p3));
	}

}
