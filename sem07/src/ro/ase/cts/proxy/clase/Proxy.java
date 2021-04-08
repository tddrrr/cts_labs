package ro.ase.cts.proxy.clase;

public class Proxy implements CreditAbstract {
	private CreditAbstract credit;
	
	
	public Proxy(CreditAbstract credit) {
		super();
		this.credit = credit;
	}


	@Override
	public void oferaCredit(tipMoneda moneda, float suma) {
		if (moneda == tipMoneda.RON) {
			credit.oferaCredit(moneda, suma);
		} else {
			System.out.println("Banca nu mai ofera credite in alte monede");
		}
	}

}
