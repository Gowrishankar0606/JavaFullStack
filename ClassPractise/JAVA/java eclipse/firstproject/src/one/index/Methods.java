package one.index;

public class Methods {
	
	static int a=10;
	int b=20;
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void staticDisplay()
	{
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Methods gs=new Methods();
		gs.display();
		
		//gs.StaicDisplay() no need to call the obj explicitly
		staticDisplay();
	}

}
