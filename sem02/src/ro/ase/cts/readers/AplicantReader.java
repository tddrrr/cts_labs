package ro.ase.cts.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import ro.ase.cts.clase.Aplicant;

public abstract class AplicantReader {
	protected String fileName; //il folosim in clasele copil, deci il facem protected
	public abstract List<Aplicant> readAplicants() throws FileNotFoundException;	
	
	public AplicantReader(String name) {
		fileName = name;
	}
	
	protected void readAplicant(Scanner input, Aplicant aplicant) {
		String nume = input.next();
		String prenume = input.next();
		int varsta = input.nextInt();
		int punctaj = input.nextInt();
		int nr = input.nextInt();
		String[] vect = new String[5];
		for (int i = 0; i < nr; i++)
			vect[i] = input.next();
		//avem o clasa abstracta, deci nu putem instantia direct un obiect, ne folosim de setteri
		//asa ca primesc un aplicant prin parametrii functiei si ii setez eu atributele
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
		aplicant.setDenumiriProiect(nr, vect);
		
	}
}
