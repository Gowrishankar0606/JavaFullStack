package one.index;
import java.util.Scanner;

public class userinput {

	public static void main(String[] args) {
		
		Scanner Gs=new Scanner(System.in);
		System.out.print("Enter the number:");
		int g=Gs.nextInt();
		System.out.println("The value is :"+g);
		
		System.out.print("Enter the float number:");
		float a=Gs.nextFloat();           
		System.out.println("The value is :"+a);
		
		System.out.print("Enter the double number:");
		double b=Gs.nextDouble();
		System.out.println("The value is :"+b);
		
		Gs.close();
		
	}

}
