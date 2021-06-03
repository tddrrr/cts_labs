package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import clase.Grupa;
import dubluri.StudentFake;

public class TestGrupaStudentFake {

	@Test
	public void testPromovabilitateAreRestante() {
		Grupa grupa1 = new Grupa(1077);
		for (int i=0; i<8; i++) {
			StudentFake studentFake = new StudentFake();
			studentFake.setAreRestante(false);
			grupa1.adaugaStudent(studentFake);
		}
		for (int i=0; i<2; i++) {
			StudentFake studentFake = new StudentFake();
			studentFake.setAreRestante(true);
			grupa1.adaugaStudent(studentFake);
		}
		assertEquals(0.8, grupa1.getPromovabilitate(), 0.01);
	}

}
