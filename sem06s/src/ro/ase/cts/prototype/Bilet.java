package ro.ase.cts.prototype;

public class Bilet implements AbstractPrototype{
	private int codBilet;
	private String echipa1;
	private String echipa2;
	private String data;
	private String loc;
	
	public Bilet(int codBilet, String echipa1, String echipa2, String data, String loc) {
		super();
		//validari costisitoare
		this.codBilet = codBilet;
		this.echipa1 = echipa1;
		this.echipa2 = echipa2;
		this.data = data;
		this.loc = loc;
	}
	
	public Bilet() {
		super();
	}

	public void setCodBilet(int codBilet) {
		this.codBilet = codBilet;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public AbstractPrototype copiaza() {
		Bilet bilet = new Bilet();
		bilet.codBilet = this.codBilet;
		bilet.data = this.data;
		bilet.echipa1 = this.echipa1;
		bilet.echipa2 = this.echipa2;
		bilet.loc = this.loc;
		return bilet;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Bilet [codBilet=");
		builder.append(codBilet);
		builder.append(", echipa1=");
		builder.append(echipa1);
		builder.append(", echipa2=");
		builder.append(echipa2);
		builder.append(", data=");
		builder.append(data);
		builder.append(", loc=");
		builder.append(loc);
		builder.append("]");
		return builder.toString();
	}
	
	
	
	
	
	
}
