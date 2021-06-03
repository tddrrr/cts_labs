package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import clase.IStudent;
import dubluri.StudentStub;

public class TestGrupaStudentStub {

	@Test
	public void testGetPromovabilitateGrupa() {
		Grupa grupa1 = new Grupa(1077);
		IStudent student1 = new StudentStub();
		grupa1.adaugaStudent(student1);
		IStudent student2 = new StudentStub();
		grupa1.adaugaStudent(student2);
		assertEquals(1, grupa1.getPromovabilitate(), 0.05);
		
	}

}
