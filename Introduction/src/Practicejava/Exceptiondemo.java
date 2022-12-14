package Practicejava;

public class Exceptiondemo {
	
	

	// one try can be followed by multiple catch blocks
	//catch should be an immediate block after try

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a=7;
		int b=0;
		
		try
		{
			int c= a/b;
			System.out.println(c);
			
			int arr[] = new int[5];
			System.out.println(arr[7]);
			
		}
		
		catch(ArithmeticException ae) 
		{
			
			System.out.println("I catched the arithmetic exception");
		}
		
		catch(IndexOutOfBoundsException aed) 
		{
			
			System.out.println("I catched the IndexOutOfBoundsException  exception");
		}
		
		
		catch (Exception E) 
		{
		System.out.println( "I found the error");	
		}
		
		finally
		{
			
			System.out.println("Delete Cookies" );//This block is executed irrespective of exception thrown or not
		}
		
		
		
		int d = a+b;
		
		System.out.println(d);
		
		
		
	}

}
