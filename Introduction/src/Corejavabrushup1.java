
public class Corejavabrushup1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int myNUM = 5;
		String Website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNUM + " is the value stored in the myNUM variable");
        System.out.println(Website);
        
        //Arrays = store multiple value in one variable 
        
        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        
        
        int[] arr2 = {1,2,3,4,5,6,9,45,65,78,99,122};
        
        //System.out.println(arr[2]);		
        
        //for loop
        
        //for(int i = 2; i< arr.length; i++)
        //{
        	
      
			//System.out.println(arr[i]);
        	
        //}
        
        for(int n :arr2)
        {
        	System.out.println(n);
        }
        
        
	String[] name = {"Rahul", "Shetty","Selenium"};
	
	for(int i = 0; i < name.length; i ++) 
	{
		System.out.println(name[i]);
	}
	
	for( String s : name)
	{
		System.out.println(s);
		
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	}

}
