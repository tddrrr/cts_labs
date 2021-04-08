package ro.ase.cts.adapter.clase;

public class AdapterCreditObiecte implements CreditAbstract{
	private Leasing leasing; 
	
	public AdapterCreditObiecte(Leasing leasing) {
		super();
		this.leasing = leasing;
	}
	@Override
	public void oferaCredit(float suma) {	
		leasing.imprumuta();
	}

}
