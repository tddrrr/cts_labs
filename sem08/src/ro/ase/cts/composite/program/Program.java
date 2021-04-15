package ro.ase.cts.composite.program;

import ro.ase.cts.composite.clase.Item;
import ro.ase.cts.composite.clase.Sectiune;

public class Program {

	public static void main(String[] args) {
		Sectiune bauturi = new Sectiune("Bauturi");
		Sectiune deserturi = new Sectiune("Desert");
		
		Item frappe = new Item("Frappe");
		Item cafea = new Item("Cafea");
		Item ecler = new Item("Ecler");
		
		bauturi.addComponenta(cafea);
		bauturi.addComponenta(frappe);
		
		deserturi.addComponenta(ecler);
		
		Sectiune meniu = new Sectiune("Meniu");
		meniu.addComponenta(bauturi);
		meniu.addComponenta(deserturi);
		
		meniu.afiseazaDescriere();
		
		bauturi.stergeComponenta(frappe);
		deserturi.addComponenta(frappe);
		
		meniu.afiseazaDescriere();

	}

}
