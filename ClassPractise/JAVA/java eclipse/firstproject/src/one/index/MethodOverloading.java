package one.index;

public class MethodOverloading {
	
	private static void display(int a)
	{
		System.out.println("Got a integer data "+a);
	}

		private static void display(String a)
		{
			System.out.println("Got a string name "+a);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading GS=new MethodOverloading();
				
				display(1);
				display("GS");
	}

}
