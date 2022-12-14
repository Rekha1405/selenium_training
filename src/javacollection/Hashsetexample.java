package javacollection;

import java.util.HashSet;
import java.util.Iterator;


public class Hashsetexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Hashset, Linkedhashset, Treeset implement set interface
		// Set interface does not accept duplicate value
		// There is no guarantee that element stored in sequential order,Random order
		
		HashSet<String> hs = new HashSet<String>();
		
		hs.add("USA");
		hs.add("UK");
		hs.add("INDIA");
		hs.add("He");
		hs.add("She");
	
		hs.add("INDIA");
		//System.out.println(hs);
		//hs.remove("INDIA");
		//System.out.println(hs);
		System.out.println(hs.isEmpty());
		System.out.println(hs.size());
// iterator
		
		Iterator<String> i= hs.iterator();
		while(i.hasNext())
		{
			
			System.out.println(i.next());
		}
		
		
		
		
		
		
	}

}
