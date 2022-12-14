package JavaStreamAutomate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaStream {
	// count the number of names starting with alphabet A in list
	//@Test
	public void regular()
	
	{ArrayList<String> names = new ArrayList<String>();
	names.add("Abhijit");
	names.add("Don");
	names.add("Alekhya");
	names.add("Adam");
	names.add("Ram");
	int count = 0;
	
	for(int i=0; i<names.size(); i++)
	{
		String actual = names.get(i);
		if (actual.startsWith("A"))
		{
			count++;
		}
	}
	 System.out.println(count);
	
	}
	
	//@Test
	
	public void streamFilter()
	
	{
		ArrayList<String> names = new ArrayList<String>();
		names.add("Abhijit");
		names.add("Don");
		names.add("Alekhya");
		names.add("Adam");
		names.add("Ram");
		// There is no life of intermediate op  if there is no terminal op
		// Terminal operation will execute only if intermediate op (filter) return true
		// We can create stream with stream package
		// How to use filter in Stream API
		Long c = names.stream().filter(s->s.startsWith("A")).count();
		System.out.println(c);
		
		
		Long d = Stream.of("Abhijit","Don","Alekhya","Adam","Ram").filter(s->
		{s.startsWith("A");
		return true;
		
		}).count();
		System.out.println(d);
		// print all the names of Arraylist
		
		//names.stream().filter(s->s.length()>4).forEach(s->System.out.println(s));
		names.stream().filter(s->s.length()>4).limit(1).forEach(s->System.out.println(s));
				
				
		
		
	}
   // @Test
	public void streamMap()
	
	{
    	{ArrayList<String> names = new ArrayList<String>();
    	names.add("Men");
    	names.add("Don");
    	names.add("Women");
    	
		// print names which have last letter as "a" with Uppercase 
		Stream.of("Abhijit","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase()).
		forEach(s->System.out.println(s));
		
		Stream.of("Abhijit","Don","Alekhya","Adam","Rama").map(s->s.toUpperCase()).forEach(s->System.out.println(s));
		
		//print names which have first letter as a with uppercase and shorted
		
		 List<String> names1= Arrays.asList("Azbhijit","Don","Alekhya","Adam","Rama");
		 names1.stream().filter(s->s.startsWith("A")).sorted().map(s->s.toUpperCase()).
		 forEach(s->System.out.println(s));
		 // Merging 2 different lists
	     Stream<String> newStream = Stream.concat(names.stream(), names1.stream());
	    // newStream.sorted().forEach(s->System.out.println(s));
	   boolean flag = newStream.anyMatch(s->s.equalsIgnoreCase("Adam"));
	   System.out.println(flag);
	   Assert.assertTrue(flag);
		
	
		
		
		
	}
	}
    @Test	
    public void streamCollect()
    
    {
    	List<String> ls = Stream.of("Abhijit","Don","Alekhya","Adam","Rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase())
    	.collect(Collectors.toList());
    	System.out.println(ls.get(0));
    	
    	
    	// int value[] = {3,2,2,7,5,1,9,7};
    	  List<Integer> values = Arrays.asList(3,2,2,7,5,1,9,7);
    	  //values.stream().distinct().forEach(s->System.out.println(s));
    	 List<Integer> li = values.stream().distinct().sorted().collect(Collectors.toList());
    	  System.out.println(li.get(2));
    	
    }
}
    

	
	
	

