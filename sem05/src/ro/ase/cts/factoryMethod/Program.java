package ro.ase.cts.factoryMethod;

public class Program {
	public static void printeazaPersonalSpital(FactoryPersonal factoryPersonal, String nume, int salariu) {
		PersonalSpital personal1 = factoryPersonal.createPersonal(nume, salariu);
		System.out.println(personal1);
	}
	
	public static void main(String[] args) {
		FactoryPersonal factoryPersonal = new FactoryBrancardier();
		printeazaPersonalSpital(factoryPersonal, "Ion", 1200);
	}
}
