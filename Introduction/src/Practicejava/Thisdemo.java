package Practicejava;

public class Thisdemo {
	
	int a = 2;
	
	public void getData() 
	
	{
		
	int a = 3;
	int c = this.a +a;
	
	System.out.println(a);
		//this refers to current object - object scope lies in class level
	System.out.println(this.a );
	System.out.println(c);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thisdemo td = new Thisdemo();
		td.getData();

	}

}
