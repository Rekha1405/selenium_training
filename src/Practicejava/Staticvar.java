package Practicejava;

public class Staticvar {
	
	String name;  // remaining variable declared in class that is Instance variable
	String address;
	static String city; //= "Gurgaon"; //static variable is class variable
	static int i;// 0;
	
	//static block = all static variable initialize in block
	
	static
	
	{
	 city ="Gurgaon";
	 i=0;
		
		
	}
	
	Staticvar(String name, String address)// variable comes in constructor is local Variable 
	{
		this.name = name;
		this.address =address;
		
		
	}
	
	public static void getCity() // its only allowed static variable and for call ,call with class name not object name
	
	{
		System.out.println(city);
	}
	
	
	
	public void getaddress()
	{
		System.out.println(name + " " +address + " "+ city);
		i++;
		System.out.println(i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Staticvar obj =new Staticvar("Babita","New colony");
		Staticvar obj1 =new Staticvar("Manish","Ashok Vihar");
		
		obj.getaddress();
		obj1.getaddress();
		Staticvar.getCity ();
		Staticvar.i =4;
		Staticvar.city = "patna";
		
		
		
		
		

	}

}
