package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import exercise_testing_Zoo.Animal;
import exercise_testing_Zoo.Zoo;

public class ZooTest {

	@Test
	void hasSpace() {
		//List<Animal> animals = new ArrayList<>();
		Zoo zoo = new Zoo(100);
		// Add a Zoo Class with a space limit and a list of animals.

		assertEquals(100, zoo.getSpace());
		assertEquals(0, zoo.getAnimals().size());
	}

	@Test
	void addAnimalsTest() {
		List<Animal> animals = new ArrayList<>();
		Zoo zoo = new Zoo(100);
		
		// adding animals to the zoo
		Animal elephant = new Animal("Elephant");
		zoo.addAnimals(elephant);

		assertEquals(1, zoo.getAnimals().size());
		Assertions.assertEquals("Elephant", zoo.getAnimals().get(0).getName());

	}

	@Test
	void displayAnimalsTest() {
		List<Animal> animals = new ArrayList<>();
		Zoo zoo = new Zoo(100);
		
		Animal lion = new Animal("Lion");
		Animal tiger = new Animal("Tiger");
		zoo.addAnimals(tiger);
		zoo.addAnimals(lion);
		
		Assertions.assertEquals("Tiger, Lion", zoo.displayAnimals());
		}
	
	@Test
	void checkSpaceTest() {
		Zoo zoo = new Zoo(50);
		Animal flamingo = new Animal("Flamingo");
		zoo.addAnimals(flamingo);
		Assertions.assertEquals("There are 49 spaces still free.", zoo.checkFreeSpace());
			
	}
	
	@Test
	void checkFullTest() {
		Zoo zoo =  new Zoo(1);
		Animal bear = new Animal("Bear");
		zoo.addAnimals(bear);
		Assertions.assertEquals("There is no free space. Zoo is full.", zoo.checkFreeSpace());
	}

}
