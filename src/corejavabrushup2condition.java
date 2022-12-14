import java.util.ArrayList;

public class corejavabrushup2condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr2 = {1,2,6,8,4,9,56,87,67,102,123};
		//2,6,8,4,56,102
		// check if array has multiple of 2
		
		for (int i=0; i<arr2.length;i++)
		
			{if (arr2[i]%2==0)
		
			{
			System.out.println(arr2[i]);
			//break;
			}
			else
			{ 
				System.out.println(arr2[i] + "is no is not multiple of 2");
			}
			}
		//ArrayList<String> a= new ArrayList<String>();
		//create object of the class = object.method
		//a.add("Rekha");
		//a.add("Suman");
		//a.add("Pinky");
		//a.add("Priti");
		//a.get(3); Extract the value
		//a.remove(2); for remove
		//
		
	//.a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..a..	
		
		
		int[] arr1 = {1,2,6,8,4,9,56,87,67,102,123};
		
		// Multiple of 2
		
		for(int i = 0;i<arr1.length;i++) 
		{
			if (arr1[i]%2==0)
			{
				System.out.println(arr1[i]);
			}
			else 
			{
				System.out.println(arr1[i] + " Not mutiple of 2");
			}
		}
		
		//  check if array has multiple of 2
		
		for(int i = 0;i<arr1.length;i++) 
		{
			if (arr1[i]%2==0)
			{
				System.out.println(arr1[i]);
				break;
			}
			else 
			{
				System.out.println(arr1[i] + " Not mutiple of 2");
			}
	     }
		ArrayList<String> a = new ArrayList<String> ();
		a.add("Rekha");
		a.add("Udit");
		a.add("Tvisha");
		a.add("Manish");
		System.out.println(a.get(3));
		System.out.println(a.remove(2));
		System.out.println(a);
		
		
		

	}
	  }
