package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.OperatorRezervari;
import ro.ase.cts.proxy.clase.ProxyOperatorRezervari;

public class Program {

	public static void main(String[] args) {
		OperatorRezervari operator1 = new OperatorRezervari();
		operator1.realizeazaRezervare(1);
		ProxyOperatorRezervari proxyOperator = new ProxyOperatorRezervari(operator1, 4);
		proxyOperator.realizeazaRezervare(2);
	}

}
