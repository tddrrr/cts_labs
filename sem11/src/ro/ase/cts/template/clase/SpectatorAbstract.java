package ro.ase.cts.template.clase;

public abstract class SpectatorAbstract {
	//folosim clasa abstracta pt ca avem nevoie de metoda finala
	
	public abstract void asezareCoada();
	public abstract void prezintaBilet();
	public abstract void realizareControlCorporal();
	public abstract void intraPeStadion();
	public abstract void ocupaLoc();
	
	public final void intrareSpectatorStadion() {
		asezareCoada();
		prezintaBilet();
		realizareControlCorporal();
		intraPeStadion();
		ocupaLoc();
	}
}
