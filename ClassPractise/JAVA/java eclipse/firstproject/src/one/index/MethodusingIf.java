package one.index;

public class MethodusingIf {
	
	static void CheckVote(int age)
	{
		if(age<18)
		{
			System.out.println("Not eligible");
		}
		else {
			System.out.println("You eligible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CheckVote(20); //method call
		CheckVote(12);
	}

}
