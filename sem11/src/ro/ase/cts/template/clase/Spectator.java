package ro.ase.cts.template.clase;

public class Spectator extends SpectatorAbstract {
	private String nume; 
	
	public Spectator(String nume) {
		super();
		this.nume = nume;
	}

	@Override
	public void asezareCoada() {
		System.out.println(nume + " s-a asezat la coada");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(nume + " a prezentat biletul");
	}

	@Override
	public void realizareControlCorporal() {
		System.out.println("Spectatorului " +nume + " i s-a realizat controlul corporal");
	}

	@Override
	public void intraPeStadion() {
		System.out.println(nume + " a intrat pe stadion");
	}

	@Override
	public void ocupaLoc() {
		System.out.println(nume + " a ocupat locul");
	}

}
