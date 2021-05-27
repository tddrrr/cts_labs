package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Grupa;
import clase.Student;

public class TestGrupa {
	private Grupa grupa;
	
	@Before
	public void Setup() {
		grupa = new Grupa(1077);
		for(int i=0; i<10; i++) {
			Student student1 = new Student("Marcel");
			student1.adaugaNota(5);
			student1.adaugaNota(10);
			student1.adaugaNota(4);

			grupa.adaugaStudent(student1);
		}
	}
	
	@Test
	public void testGetPromovabilitateRight() {
		Student student2 = new Student("Ioana");
		student2.adaugaNota(10);
		student2.adaugaNota(8);
		
		Student student3 = new Student("Maria");
		student3.adaugaNota(10);
		student3.adaugaNota(10);
		
		grupa.adaugaStudent(student3);
		grupa.adaugaStudent(student2);
		
		assertEquals(0.16, grupa.getPromovabilitate(), 0.05);
		
	}
	
	@Test
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	
	@Test
	public void testGetPromovabilitateUpperBoundary() {
		Grupa grupaNoua = new Grupa(1088);
		
		for (int i=0; i<12; i++) {
			Student student1 = new Student("Ion");
			student1.adaugaNota(10);
			student1.adaugaNota(10);
			
			grupaNoua.adaugaStudent(student1);
		}

		assertEquals(1, grupaNoua.getPromovabilitate(), 0.05);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testGetPromovabilitateError() {
		Grupa grupaNoua = new Grupa(1080);
		grupaNoua.getPromovabilitate();
	}

	@Test(timeout = 500) 
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	
	@Test
	public void testConstructorRight() {
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
