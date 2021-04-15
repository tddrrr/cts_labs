package ro.ase.cts.proxy.clase;

public class ProxyOperatorRezervari implements IOperatorRezervari{
	private OperatorRezervari operator;
	private int nrMinPersoane;
	
	public ProxyOperatorRezervari(OperatorRezervari operator, int nrMinPersoane) {
		super();
		this.operator = operator;
		this.nrMinPersoane = nrMinPersoane;
	}

	@Override
	public void realizeazaRezervare(int nrPersoane) {
		if (nrPersoane >= nrMinPersoane) {
			operator.realizeazaRezervare(nrPersoane);
		} else {
			System.out.println("Numarul minim de persoane nu este atins");
		}
	}

}
