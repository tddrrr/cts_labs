package ro.ase.cts.proxy.clase;

public class Credit implements CreditAbstract{

	@Override
	public void oferaCredit(tipMoneda moneda, float suma) {
		System.out.println("S-a oferit creditul in "+moneda+" in valoare de "+suma);		
	}

}
