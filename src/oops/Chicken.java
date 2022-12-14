package oops;

public class Chicken extends Bird {

	public Chicken(int age, String gender, float weight) {
		super(age, gender, weight);
		
	}
	// overriding the method that was defined in Bird.
	public void fly() {
		System.out.println("not able to fly");
	}

}
