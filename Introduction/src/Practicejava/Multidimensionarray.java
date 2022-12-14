package Practicejava;

public class Multidimensionarray {
	// 2 7 9 5 3
	
	// 6 8 2 1 9
	
	// 5 8 3 4 2
	
	// 7 5 1 0 6
	
	// 9 6 4 2 0
	
	// 3 5 7 9 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int xyz [][] = {{2,7,9,5,3},{6,8,2,1,9},{5,8,3,4,2},{7,5,1,0,6},{9,6,4,2,0},{3,5,7,9,3}};
		
		for ( int i = 0;i<6;i++)
		{
			for (int j = 0;j<5;j++) 
			{
				System.out.println(xyz[i][j]);
			}
		}
		//System.out.println(xyz[2][3]);
		
	}
	
}



