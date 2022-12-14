package Practicejava;

 class Maximumnumber {
	
	private void abc() {
		System.out.println("Hello");}
	
	
	
	 // 3 7 9 5 3
	
	// 6 8 2 6 9
	
	// 5 8 12 4 2
	
	// 7 5 5 3 6
	
	// 9 6 4 2 2
	
	// 3 5 7 9 3

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parentdemo pd = new Parentdemo();
		pd.protect();
		
		int xyz [][]={{3,7,9,5,3},{6,8,2,6,9},{5,8,12,4,2},{7,5,5,3,6},{9,6,4,2,2},{3,5,7,9,3}};
		int max = xyz[0][0];
		
		for (int i=0;i<6;i++)
		{
			for(int j=0;j<5;j++) 
			{
				if(xyz[i][j]>max)
				{
					max=xyz[i][j];
				}
			}
		}
		System.out.println(max);

	}

}
