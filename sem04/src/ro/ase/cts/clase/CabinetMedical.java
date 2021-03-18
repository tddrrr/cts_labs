package ro.ase.cts.clase;

public class CabinetMedical {
	private String numeDoctor;
	private int nrPacienti;
	private boolean esteCentruVaccinare;
	
	private static CabinetMedical cabinet = null;
	
	private CabinetMedical(String numeDoctor, int nrPacienti, boolean centruVaccinare) {
		super();
		this.numeDoctor = numeDoctor;
		this.nrPacienti = nrPacienti;
		this.esteCentruVaccinare = centruVaccinare;
	}
	
	public void setNumeDoctor(String numeDoctor) {
		this.numeDoctor = numeDoctor;
	}
	public void setNrPacienti(int nrPacienti) {
		this.nrPacienti = nrPacienti;
	}
	public void setCentruVaccinare(boolean centruVaccinare) {
		this.esteCentruVaccinare = centruVaccinare;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("CabinetMedical [numeDoctor=");
		builder.append(numeDoctor);
		builder.append(", nrPacienti=");
		builder.append(nrPacienti);
		builder.append(", centruVaccinare=");
		builder.append(esteCentruVaccinare);
		builder.append("]");
		return builder.toString();
	}
	
	public static synchronized CabinetMedical getInstance(String numeDoctor, int nrPacienti, boolean centruVaccinare) {
		if (cabinet == null) {
			cabinet = new CabinetMedical(numeDoctor, nrPacienti, centruVaccinare);
		}
		return cabinet;
	}
	
}
