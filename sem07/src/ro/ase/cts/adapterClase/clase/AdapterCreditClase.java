package ro.ase.cts.adapterClase.clase;

public class AdapterCreditClase extends Leasing implements CreditAbstract {

	public AdapterCreditClase(float suma, String numeClient) {
		super(suma, numeClient);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void oferaCredit() {
		super.imprumuta();
	}

}
