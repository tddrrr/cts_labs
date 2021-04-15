package ro.ase.cts.facade.clase;

public class Masa {
	private int cod;
	private int nrMaxPersoane;
	
	public Masa(int cod, int nrMaxPersoane) {
		super();
		this.cod = cod;
		this.nrMaxPersoane = nrMaxPersoane;
	}
	public int getCod() {
		return cod;
	}
	public int getNrMaxPersoane() {
		return nrMaxPersoane;
	}
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Masa [cod=");
		builder.append(cod);
		builder.append(", nrMaxPersoane=");
		builder.append(nrMaxPersoane);
		builder.append("]");
		return builder.toString();
	}
	
	
}
