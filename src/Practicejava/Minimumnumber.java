package Practicejava;

public class Minimumnumber {
	    // 3 7 9 5 3
	
		// 6 8 2 6 9
		
		// 5 8 12 4 1
		
		// 7 5 5 3 6
		
		// 9 6 4 2 2
		
		// 3 5 7 9 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int abc [][] = {{3,7,9,5,3},{6,8,2,6,9},{5,8,12,4,1},{7,5,5,3,6},{9,6,4,2,2},{3,5,7,9,3}};
		
		int m = abc[0][0];
		int minimumCol =0;
		int minimumRow = 0;
		
		for( int i=0;i<6;i++) 
		{
			for (int j=0;j<5;j++) 
			{
				if (abc[i][j]<m) 
				{
					m = abc[i][j];
					minimumCol = j;
					minimumRow = i;
				}
			}
			
			
		}
		
		int max = 0;
		
		for (int k=0;k<6;k++)
				{ 
			if (abc[k][minimumCol]>max)
			{
			max=abc[k][minimumCol];
			}
				}
		
		System.out.println(max);
		System.out.println(m);
		System.out.println(minimumCol);
		System.out.println(minimumRow);
		
		Maximumnumber mm = new Maximumnumber();
		mm.abc();

	}

}
