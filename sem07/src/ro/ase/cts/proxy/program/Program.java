package ro.ase.cts.proxy.program;

import ro.ase.cts.proxy.clase.Credit;
import ro.ase.cts.proxy.clase.Proxy;
import ro.ase.cts.proxy.clase.tipMoneda;

public class Program {

	public static void main(String[] args) {
		Credit credit = new Credit();
		credit.oferaCredit(tipMoneda.EUR, 1000);
		
		Proxy proxy = new Proxy(credit);
		proxy.oferaCredit(tipMoneda.EUR, 100);
		proxy.oferaCredit(tipMoneda.RON, 2000);

	}

}
