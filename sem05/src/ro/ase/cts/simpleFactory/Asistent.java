package ro.ase.cts.simpleFactory;

public class Asistent extends PersonalSpital{

	public Asistent(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
		
	
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Asistent [getNume()=");
		builder.append(getNume());
		builder.append(", getSalariu()=");
		builder.append(getSalariu());
		builder.append("]");
		return builder.toString();
	}

}
