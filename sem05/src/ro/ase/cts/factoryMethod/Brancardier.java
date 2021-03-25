package ro.ase.cts.factoryMethod;

public class Brancardier extends PersonalSpital {

	public Brancardier(String nume, int salariu) {
		super(nume, salariu);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Brancardier [getNume()=");
		builder.append(getNume());
		builder.append(", getSalariu()=");
		builder.append(getSalariu());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
