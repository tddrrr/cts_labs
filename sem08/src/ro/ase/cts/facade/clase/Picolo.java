package ro.ase.cts.facade.clase;

 class Picolo {
	public boolean esteDebarasata(int cod) {
		if (cod%4 == 0) {
			return true;
		} 
		return false;
	}
	
	public boolean areServetele(int cod) {
		if (cod%3 == 0) {
			return true;
		} 
		return false;
	}
}
