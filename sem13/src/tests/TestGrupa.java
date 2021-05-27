package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;

public class TestGrupa {

	@Test
	public void testConstructor() {
		Grupa grupa = new Grupa(1077);
		assertEquals(1077, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaInferioara() {
		Grupa grupa = new Grupa(1000);
		assertEquals(1000, grupa.getNrGrupa());
	}
	
	@Test
	public void testLimitaSuperioara() {
		int limitaSuperioara = 1100;
		Grupa grupa = new Grupa(limitaSuperioara);
		assertEquals(limitaSuperioara, grupa.getNrGrupa());
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMic() {
		int nrGrupa = 100;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testConstructorErrorMare() {
		int nrGrupa = 1120;
		Grupa grupa = new Grupa(nrGrupa);
	}
	
	@Test(timeout = 500) 
	public void testConstructorPerformance() {
		Grupa grupa = new Grupa(1077);
	}
	
	@Test
	public void testConstructorExistence() {
		Grupa grupa = new Grupa(1077);
		assertNotNull(grupa.getStudenti());
	}
}
