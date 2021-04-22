package ro.ase.cts.flyweight.program;

import ro.ase.cts.flyweight.clase.FlyweightFactory;
import ro.ase.cts.flyweight.clase.Rezervare;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rezervare rezervare1 = new Rezervare(1,4,"10:00");
		Rezervare rezervare2 = new Rezervare(2,3,"11:00");
		Rezervare rezervare3 = new Rezervare(3,4,"12:00");

		FlyweightFactory flyweightFactory = new FlyweightFactory();
		flyweightFactory.getClient("043252").printeazaRezervare(rezervare1);
		flyweightFactory.getClient("53453").printeazaRezervare(rezervare2);
		flyweightFactory.getClient("043252").printeazaRezervare(rezervare3);

	}

}
