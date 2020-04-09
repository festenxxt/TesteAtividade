package atv1.teste;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import atv1.Triangulo;

public class TesteTriangulo {

	private Triangulo triangulo;

	@Before
	public void setUp() throws Exception {
		triangulo = new Triangulo(1,1,1);
	}
	
		
	@Test
	public void testeTriangulo() {
		assertFalse(new Triangulo(0,0,0).isTriangulo());
		assertTrue(new Triangulo(12,9,6).isTriangulo());
	}
	
	@Test
	public void testeTrianguloEquilatero() {
		assertTrue(new Triangulo(2,2,2).isTrianguloEquilatero());
		assertFalse(new Triangulo(1,3,1).isTrianguloEquilatero());
	}
	
	@Test
	public void testeTrianguloEscaleno() {
		assertFalse(new Triangulo(2,2,2).isTrianguloEscaleno());
		assertTrue(new Triangulo(12,9,6).isTrianguloEscaleno());
	}
	
	@Test
	public void testeTrianguloIsoceles() {
		assertTrue(new Triangulo(10,10,12).isTrianguloIsoceles());
		assertFalse(new Triangulo(10,10,-4).isTrianguloIsoceles());
		assertFalse(new Triangulo(10,10,0).isTrianguloIsoceles());
	}
}
