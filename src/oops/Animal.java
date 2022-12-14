package oops;

public class Animal {
	
	int age;
	String gender;
	float weight;
	
	
	

	public Animal(int age) {
		super();
		this.age = age;
	}

	public Animal(int age, float weight) {
		super();
		this.age = age;
		this.weight = weight;
	}

	public Animal(int age, String gender, float weight) {
		super();
		this.age = age;
		this.gender = gender;
		this.weight = weight;
	}
	
	public void speak() {
		System.out.println("This animal " + age + " years old");
		System.out.println("This animal is " + gender);
		System.out.println("This animal weight is " + weight + " pound");
		
		
	}

	public void eat() {
		
		System.out.println("Eating.....");
		
	}
	

	public void sleep() {
		
		System.out.println("Sleeping.....");	
		
	}
	public void slept();

}
