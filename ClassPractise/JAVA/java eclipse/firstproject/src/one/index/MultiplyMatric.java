package one.index;

public class MultiplyMatric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r1=2,c1=3;
		int r2=3,c2=2;
		int[][] firstMatix= {{3,-2,5},{3,0,4}};
		int[][] secondMatrix= {{3,1},{3,2},{0,4}};
		
		//multiplying two matrices 
		
		int [][] product=new int[r1][r2];
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				for(int k=0;k<c1;k++)
				{
					product[i][j]+=firstMatix[i][k]*secondMatrix[k][j];
					
				}
			}
		}
		System.out.println("Multiplication of 2 matrices is:");
		
		for(int[] row:product)
		{
			for(int column:row)
			{
				System.out.println(column+"");
			}
			
			System.out.println();
		}
		
	}

}
