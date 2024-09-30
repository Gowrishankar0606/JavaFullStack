package one.index;

public class ParameterConstructor {

	int id;
	String name;
	
	public ParameterConstructor(int i, String n)
	{
		
		id=i;
		name=n;
	}
	
	public void display()
	{
		System.out.print("The id value is "+id+" "+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterConstructor gs=new ParameterConstructor(111,"Gowri");
		
		gs.display();
		
	}

}
