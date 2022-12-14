package javacollection;

import java.util.ArrayList;

public class Arraylistexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//can accept duplicate value
		//Arraylist, Linkedlist, Vector- implementing list interface
		// array have fixed size where as arraylist  can grow dynemically
		// you can access and insert any value in any index
		
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Rekha");
		a.add("Sharma");
		System.out.println(a);
		
		a.add(1, "Udit");
		System.out.println(a);
		/*a.remove(1);
		System.out.println(a);
		a.remove("Sharma");
		System.out.println(a);*/
	
		System.out.println(a.get(2));
		
		//Testing is present or not
		System.out.println(a.contains("Rekha"));
		//a.removeAll(a);
		//System.out.println(a);
		System.out.println(a.indexOf("Udit"));
		System.out.println(a.isEmpty());
		System.out.println(a.size());
		
	
		
		
		
	}

}