package ro.ase.cts.program;

import ro.ase.cts.clase.BrokerTranzactie;
import ro.ase.cts.clase.LazyBrokerTranzactie;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrokerTranzactie broker1 = BrokerTranzactie.getInstance();
		BrokerTranzactie broker2 = BrokerTranzactie.getInstance();
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		broker1.setNume("Alina");
		broker2.setNrTranzactiiEfectuate(9);
		
		System.out.println(broker1.toString());
		System.out.println(broker2.toString());
		
		LazyBrokerTranzactie lazy1 = LazyBrokerTranzactie.getInstance("Ana", 2, 30);
		LazyBrokerTranzactie lazy2 = LazyBrokerTranzactie.getInstance("Banana", 10, 30);
		
		System.out.println(lazy1.toString());
		System.out.println(lazy2.toString()); //returneaza lazy1

	}

}
