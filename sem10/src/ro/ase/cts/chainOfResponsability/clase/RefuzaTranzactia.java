package ro.ase.cts.chainOfResponsability.clase;

public class RefuzaTranzactia extends Handler{

	public RefuzaTranzactia() {
		super(0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void realizeazaPlata(float suma) {
		System.out.println("Plata nu poate fi realizata");
	}

}
