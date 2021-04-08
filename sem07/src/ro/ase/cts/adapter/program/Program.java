package ro.ase.cts.adapter.program;

import ro.ase.cts.adapter.clase.AdapterCreditObiecte;
import ro.ase.cts.adapter.clase.CreditAbstract;
import ro.ase.cts.adapter.clase.Leasing;

public class Program {
	public static void afiseazaInfoCredit(CreditAbstract credit, float suma) {
		credit.oferaCredit(suma);
	}
	public static void main(String[] args) {
		
		Leasing leasing = new Leasing(1000, "Ion Popescu");
		AdapterCreditObiecte adapter = new AdapterCreditObiecte(leasing);
		afiseazaInfoCredit(adapter, leasing.getSuma());
	}
}
