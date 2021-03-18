package ro.ase.cts.clase;

public class LazyBrokerTranzactie {
	private String nume;
	private int vechime;
	private int nrTranzactiiEfectuate;
	//Lazy Initialization - initializam cand avem nevoie
	
	private static LazyBrokerTranzactie broker = null; //amanam apelul constructorului
	//constructorul public inseamna ca nu avem clasa singleton; deci trb private
	private LazyBrokerTranzactie(String nume, int vechime, int nrTranzactiiEfectuate) {
		super();
		this.nume = nume;
		this.vechime = vechime;
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	public void setNume(String nume) {
		this.nume = nume;
	}

	public void setVechime(int vechime) {
		this.vechime = vechime;
	}

	public void setNrTranzactiiEfectuate(int nrTranzactiiEfectuate) {
		this.nrTranzactiiEfectuate = nrTranzactiiEfectuate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("LazyBrokerTranzactie [nume=");
		builder.append(nume);
		builder.append(", vechime=");
		builder.append(vechime);
		builder.append(", nrTranzactiiEfectuate=");
		builder.append(nrTranzactiiEfectuate);
		builder.append("]");
		return builder.toString();
	}
	// pt a fi thread safe folosim synchronized; eager initialization e clar threadSafe
	public static synchronized LazyBrokerTranzactie getInstance(String name, int vechime, int nrTranzactii) {
		if (broker == null) {
			broker = new LazyBrokerTranzactie(name, vechime, nrTranzactii);
		}
		return broker; 
	}
	
	
}
