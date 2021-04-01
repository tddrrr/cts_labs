package ro.ase.cts.prototype;

public class Program {

	public static void main(String[] args) {
		ContClient client = new ContClient("Ion", 19); //prototipul il creez cu constr cu parametri, cel care face validari
		ContClient client2 = (ContClient) client.copiaza(); //in copiaza() am apelat constr fara parametri, fara validari costisitoare
		System.out.println(client);
		System.out.println(client2);
		
		Bilet bilet1 = new Bilet(1, "Arsenal", "Barcelona", "1 Aprilie", "1");
		Bilet bilet2 = new Bilet(2, "FCSB", "Barcelona", "2 Aprilie", "2");
		
		Bilet bilet3 = (Bilet) bilet1.copiaza();
		bilet3.setCodBilet(3);
		bilet3.setLoc("4F");
		Bilet bilet4 = (Bilet) bilet1.copiaza();
		bilet4.setCodBilet(4);
		bilet4.setLoc("5F");
		
		System.out.println(bilet3.toString());
		System.out.println(bilet4.toString());

	}

}
