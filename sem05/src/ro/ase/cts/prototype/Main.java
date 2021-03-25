package ro.ase.cts.prototype;

public class Main {

	public static void main(String[] args) {
		Reteta reteta1 = new Reteta("apa oxigenata", 20);
		Reteta reteta2 = (Reteta)reteta1.copiaza();
		System.out.println(reteta1);
		System.out.println(reteta2);

	}

}
