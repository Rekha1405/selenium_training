package Practicejava;

public class Constructdemo {
	
	public Constructdemo()
	
	{
		System.out.println(" I am the constructor");	
	}
	// Parameterized constructor
	
    public Constructdemo(int a,int b)
	
	{
		//in c = a + b;
    	System.out.println(a + b);	
	}
    
    public Constructdemo(String str)
	
	{
		//in c = a + b;
    	System.out.println(str);	
	}
	public void getdata()
	
	{
		System.out.println(" I am the method");
	}
	
	// constructor will not return any values
	// name of constructor should be always the class name
	// when we create a object for any class constructor is called
	
	
	public static void main (String[] args) {
		
		
		Constructdemo cd = new Constructdemo();
		Constructdemo c = new Constructdemo(6,7);
		Constructdemo ca = new Constructdemo("Rekha Sharma");
		cd.getdata();
		
		
	}

}
