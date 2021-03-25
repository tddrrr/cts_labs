package ro.ase.cts.factoryMethod;

public class Anestezist extends PersonalSpital{

	public Anestezist(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Anestezist [getNume()=");
		builder.append(getNume());
		builder.append(", getSalariu()=");
		builder.append(getSalariu());
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
