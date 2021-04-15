package ro.ase.cts.facade.clase;

 class GestiuneMese {
	public boolean esteMasaLibera(int cod) {
		if (cod%2 == 1) {
			return true;
		} 
		return false;
	}
}
