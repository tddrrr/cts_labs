package ro.ase.cts.factoryMethod;

public class Medic extends PersonalSpital{

	public Medic(String nume, int salariu) {
		super(nume, salariu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Medic [getNume()=");
		builder.append(getNume());
		builder.append(", getSalariu()=");
		builder.append(getSalariu());
		builder.append(", getClass()=");
		builder.append(getClass());
		builder.append(", hashCode()=");
		builder.append(hashCode());
		builder.append(", toString()=");
		builder.append(super.toString());
		builder.append("]");
		return builder.toString();
	}
	
}
