package one.index;

public class AdditionMatrix {

	public static void main(String args[])
	{
		//creating 2 matrices 
		
		int a[][]= {{1,6,4},{2,4,3},{3,4,5}};
		int b[][]= {{2,3,4},{2,4,3},{4,4,5}};
		
		//Creating another matrices to store the sum of a[][] & b[][]	
	int c[][]	=new int [3][3];
	
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++) {
			c[i][j]=a[i][j]+b[i][j];
			System.out.println(c[i][j]+"");
		}
		System.out.println();
	}
	}
	
}
