import java.util.Scanner;

public class extrawork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
	int number = s.nextInt();
	for (int i=1; i<=10; i++)
	{
		System.out.println(i*number);
	}

	int factorial = 1;
	for (int i=number;i>0;i--)
	{
		
		factorial=i*factorial;

		
	}
	System.out.println(factorial);
	
	int sum = 0;
	for(int i = number;i>0;i--)
	{
		
		sum=i+sum;
	}
	
	System.out.println("Natural Sum = " + sum);
	}

}
