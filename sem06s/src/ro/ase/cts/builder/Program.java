package ro.ase.cts.builder;

public class Program {

	public static void main(String[] args) {
		Rezervare rezervare = new RezervareBuilder().setAreBauturaRacoritoare(true).setCodRezervare(1).build();
		Rezervare rezervare2 = new RezervareBuilder().setAreMancareInclusa(true).setCodRezervare(4).setAreBauturaRacoritoare(true).build();
		
		System.out.println(rezervare.toString());
		System.out.println(rezervare2.toString());

		
		RezervareBuilder builder = new RezervareBuilder().setAreBauturaRacoritoare(true);
		Rezervare rezervare3 = builder.build();  //se realizeaza shallow copy
		Rezervare rezervare4 = builder.setCodRezervare(100).build(); //se realizeaza shallow copy
	}

}
