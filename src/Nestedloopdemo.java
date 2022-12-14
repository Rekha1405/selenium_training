
public class Nestedloopdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		/*for(int i =1; i<=4;i++)
		{
			System.out.println(i +"outer loop");
			for(int j=4;j<=10;j++)
			{
				System.out.println(j + "inner loop");
			}
		
		}*/
		//..............................
		
		/*int a=5;
	    
		for(int counter=1;counter<=a;counter++) {
			for(int counter2=1;counter2<=counter;counter2++) {
				System.out.print (" "+counter2);
				
			}
			System.out.println();
		}*/
		/* int b=1;
		for(int i=5;i>=b;i--) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" "+ j);
			}
			
			System.out.println();
		}
		*/
		
		int b =5;
		
		for(int i=1;i<=b;i++) 
		{
			for(int j=1;j<=b+1-i;j++) {
				System.out.print(" "+ j);
			}
			
			System.out.println();
		}
		
		
		//................
		
		int k=1;
		for (int i=1;i<=4;i++) 
		{
			for(int j=1;j<=4+1-i;j++) {
				System.out.print(" " + k);
				k++;
			}
			System.out.println();
			
		}
		//.................
		
		int k1=1;
		for (int i=4;i>=1;i--) 
		{
			for(int j=1;j<=4+1-i;j++) {
				System.out.print(" " + k1);
				k1++;
			}
			System.out.println();
			
		}
		//..........................
		
		int k2=1;
		for (int i=1;i<=4;i++) 
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" " + k2);
				k2++;
			}
			System.out.println();
			
		}
		//................
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++) {
				System.out.print(" " + j);
			}
			System.out.println();
		}
	}

	
}
