package ro.ase.cts.facade.program;

import ro.ase.cts.facade.clase.Facade;
import ro.ase.cts.facade.clase.GestiuneMese;
import ro.ase.cts.facade.clase.Masa;
import ro.ase.cts.facade.clase.Picolo;

public class Program {

	public static void main(String[] args) {
//		GestiuneMese gestionar = new GestiuneMese();
//		Picolo picolo = new Picolo();
//		Masa masa = new Masa(4, 4);
//		
//		if (gestionar.esteMasaLibera(masa.getCod())) {
//			if (picolo.esteDebarasata(masa.getCod())) {
//				if (picolo.areServetele(masa.getCod())) {
//					System.out.println("Pofiti la masa "+masa.getCod());
//				} else System.out.println("Mai asteptati");
//			} else System.out.println("Mai asteptati");
//		} else System.out.println("Mai asteptati");
		
		Masa masa = new Masa(5, 10);
		if (Facade.disponibilitateMasa(masa)) {
			System.out.println("Poftiti la masa");
		} else {
			System.out.println("Mai asteptati");
		}
	}

}
