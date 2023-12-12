package test;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import exercise_testing_Zoo.Animal;

public class AnimalTest {
	@Test
	void hasName() {
		// Add an Animal Class which holds just the name of the animal. The name is
		// required.

		// given <- base

		// when <- input
		Animal tiger = new Animal("Tiger");

		// Then <- Expected behavior/result
		assertEquals(tiger.getName(), "Tiger");

	}

	
}
