package clase;

public abstract class Animal { //abstracta - nu poate fi instantiata, folosita ca reference type
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal(String name) {
		super();
		this.name = name;
	}
	
	
}
