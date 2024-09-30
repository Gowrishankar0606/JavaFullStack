package one.index;

public class ConstructorOverloading {

	String name;
	int id,age;
	
	ConstructorOverloading(int i,  String n )
	{
		id=i;
		name=n;
	
	}
	
	ConstructorOverloading(int i, int a, String n )
	{
		id=i;
		name=n;
		age =a;
	
	}
	
	void display()
	{
		System.out.println("The value of the id, name, age:"+id+" "+name+""+age);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorOverloading gs = new ConstructorOverloading(101,"GS");
		ConstructorOverloading gs1 = new ConstructorOverloading(102,45,"Rahul");
		gs.display();
		gs1.display();
	}

}
