package ro.ase.cts.chainOfResponsability.clase;

public class ContCurent extends Handler{

	public ContCurent(float sold) {
		super(sold);
	}

	@Override
	public void realizeazaPlata(float suma) {
		if (super.getSold() >= suma) {
			super.setSold(getSold()-suma);
			System.out.println("S-a realizat plata de "+suma+ " din contul curent");
		} else {
			super.getSuccesor().realizeazaPlata(suma);
		}
	}
	
}
