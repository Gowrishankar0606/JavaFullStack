package one.index;
import java.util.Scanner;

public class Controlstatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int a=10;

	
	if(a<20) 
	{
		System.out.println("The Number is less than 10");
	}

	int c=20;
	if(c%2==0)
	{
		System.out.println(c+" is number is odd number");
	}
	else
	{
		System.out.println(c+" is number is even number");
	}
	
	Scanner Gs=new Scanner(System.in);
	
	System.out.print("Enter the Age:");
	int age=Gs.nextInt();
	
	if(age<18)
	{
		System.out.println("Not Eligible to vote.");
	}
	
	else {
		System.out.println("Eligible to Vote.");
	}
	
	
	System.out.println("Enter the mark:");
	int mark=Gs.nextInt();
	
	if(mark>90 && mark==100)
	{
		System.out.print("You are Distinsion.");
	}
	else if(mark>=80 && mark<90)
	{
		System.out.print("You are 1st class");
	}
	
	else if(mark>=50 && mark<80)
	{
		System.out.print("You are 2nd class.");
		
	}
	
	else if(mark>=30 && mark<50)
	{
		System.out.print("You are pass.");
	}
	else {
		System.out.print("You enter the wrong mark. ");
	}
	
	
	int age1=20;
	String citizen="Indian";
	if(age1>18)
	{
		if(citizen=="Indian")
		{
			System.out.println("You are eligible to vote ");
		}
	}

	
	
	if(age>=18)
	{
		if(mark>=90)
		{
			System.out.print("You are eligible to write board exam.");
		}
	}
	
	
	
	Gs.close();
	
	
	
	
	
	
	
	}
}
