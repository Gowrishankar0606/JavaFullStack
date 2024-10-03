package one.index;
import java.util.Scanner;

public class mulitpdimentionalarray {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner GS=new Scanner(System.in);
		int a[][]=new int[100][100];
		int row,i,j,col;
		
		System.out.println("Enter the Number of rows:");
		row=GS.nextInt();
		
		System.out.println("Enter the Number of Columns:");
		col=GS.nextInt();
		
		for(i=0;i<row;i++)
		{
			
			for(j=0;j<col;j++)
			{
				System.out.printf("Enter the element a[%d][%d]",i,j);
				a[i][j]=GS.nextInt();
			}
		}
		System.out.println("Display 2D Array Elements:");
		for(i=0;i<row;i++)
		{
			for(j=0;j<col;j++)
			{
				System.out.println(a[i][j]+"");
			}
		}
		System.out.println();
	}

}
