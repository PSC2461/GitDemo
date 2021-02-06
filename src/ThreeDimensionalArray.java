
public class ThreeDimensionalArray {

	public static void main(String[] args) {


		/* 2	4	6
		 * 8	0	1
		 * 7	3	5   find max. number*/
		
		int abc[][]= {{2,4,6},{8,4,1},{7,3,5}};
		
		int max=abc[0][0];
		
		for(int i=0; i<3; i++) 
		{	
			for (int j=0; j<3; j++)
			{
				if (abc[i][j] > max) 
				{
					
					max= abc[i][j];
				}
			}
			
					
			
		}
		System.out.println("max. number from matrix is " +max);
	}

}
