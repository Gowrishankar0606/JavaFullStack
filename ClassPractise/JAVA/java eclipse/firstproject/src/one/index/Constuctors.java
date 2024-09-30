package one.index;

public class Constuctors {

	
		
//constructor is the special method that is used to initilize the object the constructor is call when the object of the class is created   
//constructor called using the new operter
//constructor does not have any return type
//constructor with no parameter is called default construtor
//constructor can take argument or parameter which are stored as private field
int value1,value2;
		Constuctors()
		{
		 value1=10;
		 value2=20;
		}
	
	public void display()
	{
		System.out.println("Value1="+value1);
		System.out.println("Value2="+value2);
		
		
	}
	
	public static void main(String args[])
	{
		Constuctors gs=new Constuctors();
		
		gs.display();
	}

}
