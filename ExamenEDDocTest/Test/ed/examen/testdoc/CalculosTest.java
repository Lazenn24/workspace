package ed.examen.testdoc;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculosTest {

	@Test
	public void testPotencia1() {
		
		Calculos potencia = new Calculos();
		
		int salida = potencia.potencia(2, 3);
		
		assertEquals(8, salida);
	}
	
	@Test
	public void testPotencia2() {
		
		Calculos potencia = new Calculos();
		
		int salida = potencia.potencia(0, 2);
		
		assertEquals(0, salida);
	}
	@Test
	public void testPotencia3() {
		
		Calculos potencia = new Calculos();
		
		int salida = potencia.potencia(5, 0);
		
		assertEquals(1, salida);
	}
	@Test
	public void testPotencia4() {
		
		Calculos potencia = new Calculos();
		
		int salida = potencia.potencia(0, 0);
		
		assertEquals(0, salida);
	}
	@Test
	public void testPotencia5() {
		
		Calculos potencia = new Calculos();
		
		int salida = potencia.potencia(-2, 3);
		
		assertEquals(-8, salida);
	}


	@Test
	public void testFactorial1() {
		Calculos factorial = new Calculos();
		
		int salida = factorial.factorial(3);
		
		assertEquals(6, salida);
	}
	@Test
	public void testFactorial2() {
		Calculos factorial = new Calculos();
		
		
		int salida = factorial.factorial(0);		
		
		assertEquals(0, salida);
	}

	@Test
	public void testFactorial3() {
		Calculos factorial = new Calculos();
		
		int salida = factorial.factorial(-1);
		
		
		assertEquals("Error: -1 Entrada no válida", salida);
	}

	@Test
	public void testFactorial4() {
		Calculos factorial = new Calculos();
		
		int salida = factorial.factorial(5);
		
		assertEquals(60, salida);
	}
	
	@Test
	public void testFactorial5() {
		Calculos factorial = new Calculos();
		
		int salida = factorial.factorial(-3);
		
		assertEquals("Error: -3 Entrada no válida", salida);
	}



	@Test
	public void testAreaTriangulo1() {
		
		Calculos area = new Calculos();
		
		double salida = area.areaTriangulo(2, 3);
		
		assertEquals(3, salida, 0.01);
	}
	
	@Test
	public void testAreaTriangulo2() {
		
		Calculos area = new Calculos();
		
		double salida = area.areaTriangulo(-1, 3);
		
		assertEquals(3, salida, 0.01);
	}
	
	@Test
	public void testAreaTriangulo3() {
		
		Calculos area = new Calculos();
		
		double salida = area.areaTriangulo(2, -4);
		
		assertEquals(-4, salida, 0.01);
	}
	
	@Test
	public void testAreaTriangulo4() {
		
		Calculos area = new Calculos();
		
		double salida = area.areaTriangulo(0, 2);
		
		assertEquals(0, salida, 0.01);
	}
	
	@Test
	public void testAreaTriangulo5() {
		
		Calculos area = new Calculos();
		
		double salida = area.areaTriangulo(2, 0);
		
		assertEquals(0, salida, 0.01);
	}
	
	

}
