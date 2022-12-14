package oops;

public class Human {
	
	
	String name;
	int age;
	int heightinches;
	String eyecolor ;
	
	
	
	public Human(String name, int age, int heightinches, String eyecolor) {
		super();
		this.name = name;
		this.age = age;
		this.heightinches = heightinches;
		this.eyecolor = eyecolor;
	}

	public void speak() {

	System.out.println("Hello my name is " + name);
	System.out.println("I am " + age + " years old");
	System.out.println("I am " + heightinches + " inches tall");
	System.out.println("My eyecolor is " + eyecolor);
		

	}
	
	public void eat() {
		System.out.println("eating...");
	}
	public void walk() {
		System.out.println("walking....");
	}
	public void work() {
		System.out.println("working....");
		
	}

}
