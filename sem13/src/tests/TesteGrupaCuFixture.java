package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import categorii.TesteGetPromovabilitate;
import clase.Grupa;
import clase.Student;

public class TesteGrupaCuFixture {
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
	@Category({TesteGetPromovabilitate.class})
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
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitateLowerBoundary() {
		assertEquals(0, grupa.getPromovabilitate(), 0.05);
	}
	@Test(timeout = 500) 
	@Category({TesteGetPromovabilitate.class})
	public void testGetPromovabilitatePerformance() {
		grupa.getPromovabilitate();
	}
	

}
