package ro.ase.cts.flyweight.clase;

public class Rezervare {
	private int numarMasa;
	private int nrPersoane;
	private String oraRezervare;
	
	public Rezervare(int numarMasa, int nrPersoane, String oraRezervare) {
		super();
		this.numarMasa = numarMasa;
		this.nrPersoane = nrPersoane;
		this.oraRezervare = oraRezervare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Rezervare [numarMasa=");
		builder.append(numarMasa);
		builder.append(", nrPersoane=");
		builder.append(nrPersoane);
		builder.append(", oraRezervare=");
		builder.append(oraRezervare);
		builder.append("]");
		return builder.toString();
	}
	
	
}
