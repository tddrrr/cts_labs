package sem01_cts;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {
	public static void main(String[] args) {
		System.out.println("first lab");
		Zoo zoo = new Zoo();
		Zookeeper zookeeper = new Zookeeper();
		zookeeper.setName("Marcel");
		zoo.setZookeeper(zookeeper);
		
		Zebra zebra1 = new Zebra("Marcelina");
		Zebra zebra2 = new Zebra("Marcelino");
		zoo.add(zebra1);
		zoo.add(zebra2);
		zoo.feedAll();
		
		Girafa girafa1 = new Girafa("Lily");
		Girafa girafa2 = new Girafa("Lilian");
		zoo.add(girafa1);
		zoo.add(girafa2);
		zoo.feedAll();
	}

}
