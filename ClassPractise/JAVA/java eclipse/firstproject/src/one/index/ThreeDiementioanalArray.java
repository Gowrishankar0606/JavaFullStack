package one.index;

public class ThreeDiementioanalArray {

	//Syntax  
	//datatype[][][] arr =new datatype[depth][row][col]
	
	public static void main (String[] args)
	{
		
		//creating 3D with 2*3*4 
		
		int[][][] cube=new int[2][3][4];
		//initializing values 
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;j++)
				{
					cube[i][j][k]=i+j+k;
				}
				
			}
			
		}
		
		//accessing the variables 
		
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<3;j++)
			{
				for(int k=0;k<4;k++)
				{
					System.out.print(cube[i][j][k]+"");
				}
				System.out.println();
			}
		}
	}
}
