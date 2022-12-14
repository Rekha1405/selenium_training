package Practicejava;

public class Childdemo extends Parentdemo {
	
	String name = "Java Class";
	
	public Childdemo() 
	
	{
		
		//super();	
	System.out.println("child class constructor");
	
		
	}
	
	public void getStringData() 
	
	{
		System.out.println(super.name);
		System.out.println(name);
		
		
	}
	public void getData() 
	{
		
		System.out.println("I am child Class.");
		super.getData();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Childdemo cd = new Childdemo();
		
		cd.getStringData();
		cd.getData();
		cd.protect();
		

	}

}
