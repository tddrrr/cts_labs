package ro.ase.cts.decorator;

public class Card implements CardAbstract {
	private String detinator;

	public Card(String detinator) {
		super();
		this.detinator = detinator;
	}
	
	@Override
	public void realizeazaPlataOnline() {
		System.out.println(detinator + " realizeaza plata online");
	}

	@Override
	public void realizeazaPlataNormala() {
		System.out.println(detinator + " realizeaza plata normala");
	}

	@Override
	public String getDetinator() {
		return this.detinator;
	}
}
