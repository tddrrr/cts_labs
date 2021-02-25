package clase;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private List<Animal> animalList;
	private Zookeeper zookeeper;
	
	public Zoo(List<Animal> animalList, Zookeeper zookeeper) {
		super();
		this.animalList = animalList;
		this.zookeeper = zookeeper;
	}
	
	public Zoo() {
		super();
		animalList = new ArrayList<Animal>();
		zookeeper = new Zookeeper();
	}
	
	public void add(Animal animal) {
		animalList.add(animal);
	}
	
	public void feedAll() {
		for(Animal animal : animalList) {
			zookeeper.feed(animal);
		}
	}

	public List<Animal> getAnimalList() {
		return animalList;
	}

	public void setAnimalList(List<Animal> animalList) {
		this.animalList = animalList;
	}

	public Zookeeper getZookeeper() {
		return zookeeper;
	}

	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}
	
	
}