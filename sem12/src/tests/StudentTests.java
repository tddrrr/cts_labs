package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase.Student;

public class StudentTests {
	
	Student student = null; 
	
	@Before
	public void setUp() {
		student = new Student();
	}
	

	@Test
	public void testApelConstructorCuParametru() {
		String nume = "Ion";
		Student student = new Student(nume);
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testApelConstructorFaraParametri() {
		String nume = "Student";
		Student student = new Student();
		
		assertEquals(nume, student.getNume());
	}
	
	@Test
	public void testInitializareListaConstructorFaraParametri() {
//		Student student = new Student();
		assertNotNull(student.getNote());
	}
	
	@Test
	public void testAdaugareNotaInLista() {
//		Student student = new Student();
		int nota = 10;
		student.adaugaNota(nota);
		assertEquals(nota, student.getNota(0));
	}
	
	@Test
	public void testDimensiuneLista() {
//		Student student = new Student();
		int nota = 9;
		student.adaugaNota(nota);
		assertEquals(1, student.getNote().size());
	}
	
	@Test
	public void testSetareNume() {
//		Student student = new Student();
		String nume = "Teo";
		student.setNume(nume);
		assertEquals(nume, student.getNume());
	}
	
	@Test 
	public void testCalculMedie() {
		student.adaugaNota(7);
		student.adaugaNota(8);
		assertEquals(7.5, student.calculeazaMedie(), 0.01);
	}
	
	@Test 
	public void testCalculMedieFaraNote() {
		assertEquals(0, student.calculeazaMedie(), 0.01);
	}
	
	@Test 
	public void testCalculeazaMediePentruONota() {
		int nota = 9; 
		student.adaugaNota(nota);
		assertEquals(nota, student.calculeazaMedie(), 0.01);
	}
	
	@Test
	public void testVerificareRestante() {
		int nota1 = 4;
		int nota2 = 10;
		student.adaugaNota(nota2);
		student.adaugaNota(nota1);
		
		assertTrue(student.areRestante());
	}
	
	@Test
	public void testVerificareNuAreRestante() {
		int nota1 = 9;
		int nota2 = 10;
		student.adaugaNota(nota2);
		student.adaugaNota(nota1);
		assertFalse(student.areRestante());
	}
	
	@Test
	public void testVerificareRestanteFaraNote() {
		assertFalse(student.areRestante());
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void testVerificareAruncareExceptieIndex() {
		int index = -1;
		student.getNota(index);
	}
	
	@Test
	public void testGetNotaShouldThrowException() {
		//1
		try {
			//2
			student.getNota(-1);
			fail("nu trebuia sa ajunga aici");
		} catch(IndexOutOfBoundsException err) {
			//4
		}
		//5
	}
}
