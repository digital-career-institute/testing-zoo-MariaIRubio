package exercise_testing_Zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

	private int space;
	private List<Animal> animals;

	public Zoo(int space) {
		this.space = space;
		this.animals = new ArrayList<>();
	}

	public int getSpace() {
		return space;
	}

	public List<Animal> getAnimals() {
		return animals;
	}

	public void addAnimals(Animal animal) {
		if (animals.size() + 1 < space) {
			animals.add(animal);
		}
	}

	public String displayAnimals() {
		StringBuilder result = new StringBuilder();
		for (Animal animal : animals) {
			result.append(animal.getName()).append(", ");
		}
		if(result.length() > 0) {
			result.setLength(result.length() - 2); // eliminate the last , and the space if there is only one animal on the list
		}
		return result.toString();
	}
	
	public String checkFreeSpace() {
		if(animals == null) {
			animals = new ArrayList<>();
		}
		int freeSpaces = space - animals.size();
		if(freeSpaces <= 0) {
			return "There is no free space. Zoo is full.";
		}else {
			return "There are " + freeSpaces + " spaces still free.";
		}
	}
}
