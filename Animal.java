package exercise_testing_Zoo;

public class Animal {
	
	private String name;
	
	public Animal(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}
