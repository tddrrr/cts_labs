package ro.ase.cts.strategy.clase;

public class Client {
	private String nume;
	private ModPlata modPlata;
	
	public Client(String nume) {
		super();
		this.nume = nume;
		this.modPlata = new Card(); //o modalitate de plata default 
	}
	
	public void platesteNota(double suma) {
		System.out.println("Clientul " +nume + " are de platit nota");
		modPlata.plateste(suma);
	}

	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	
	
}
