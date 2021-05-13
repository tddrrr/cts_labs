package ro.ase.cts.template.clase;

public class SpectatorVIP extends SpectatorAbstract{
	private String numeVip;
	
	
	public SpectatorVIP(String numeVip) {
		super();
		this.numeVip = numeVip;
	}

	@Override
	public void asezareCoada() {
		System.out.println(numeVip + " se prezinta in zona VIP");
	}

	@Override
	public void prezintaBilet() {
		System.out.println(numeVip + " prezinta biletul VIP");

	}

	@Override
	public void realizareControlCorporal() {
		System.out.println(numeVip + " i-a fost realizat controlul");

	}

	@Override
	public void intraPeStadion() {
		System.out.println(numeVip + " intra in loja VIP");

	}

	@Override
	public void ocupaLoc() {
		System.out.println(numeVip + " ocupa loc in loja VIP");

	}

}
