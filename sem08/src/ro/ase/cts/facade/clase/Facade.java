package ro.ase.cts.facade.clase;

public class Facade {
	public static boolean disponibilitateMasa(Masa masa) {
		GestiuneMese gestionar = new GestiuneMese();
		Picolo picolo = new Picolo();
		
		if (gestionar.esteMasaLibera(masa.getCod())) {
			if (picolo.esteDebarasata(masa.getCod())) {
				if (picolo.areServetele(masa.getCod())) {
					return true;
				} return false;
			} return false;
		} return false;
	}
}
