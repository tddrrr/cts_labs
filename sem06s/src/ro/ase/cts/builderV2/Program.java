package ro.ase.cts.builderV2;

public class Program {

	public static void main(String[] args) {

		RezervareBuilder builder = new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(55);
		Rezervare rezervare = builder.build();
		builder.setCodRezervare(2).setAreMancareInclusa(true);
		Rezervare rezervare2 = builder.build();
		System.out.println(rezervare);
		System.out.println(rezervare2);

	}

}
