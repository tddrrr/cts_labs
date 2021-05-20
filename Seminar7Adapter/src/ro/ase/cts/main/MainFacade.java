package ro.ase.cts.main;

import java.time.LocalDate;

import ro.ase.cts.facade.BirouCredite;
import ro.ase.cts.facade.Facade;
import ro.ase.cts.facade.Persoana;
import ro.ase.cts.facade.Politie;

public class MainFacade {

	public static void main(String[] args) {
		Persoana persoana = new Persoana("George", "1990321352267");
		if(persoana.getVarsta()>=18) {
			if(!Politie.esteUrmaritDePolitie(persoana)) {
				if(!BirouCredite.areCreante(persoana)) {
					System.out.println("I se ofera credit lui " + persoana.getNume());
				}
			}
		}
		
		Persoana persoana2 = new Persoana("Andrei", "1990321352267");
		if(Facade.verificaPersoana(persoana2)) {
			System.out.println("I se ofera credit lui " + persoana2.getNume());
		}

	}

}
