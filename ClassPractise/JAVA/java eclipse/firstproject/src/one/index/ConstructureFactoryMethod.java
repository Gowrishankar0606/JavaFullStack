package one.index;

public class ConstructureFactoryMethod {

	
	//what is singleton design pattern 
	//To avoid private field costructor there must be a singleton design pattern to ensure instance of a class exist through out the application  
	//global access point to get instance of the class
	
	private String name,department;
	private int age;
	private ConstructureFactoryMethod(String name, int age, String department)
	{
		this.name=name;
		this.age=age;
		this.department=department;
	}
	//design pattern that helps to create obj without specifying their exact classed
	//Factory method is used to define a method to create a obj instead of calling constructor
	public static ConstructureFactoryMethod createFactoryMethod (String name, int age, String department)
	{
		return new ConstructureFactoryMethod(name,age,department);
	}
	
	public static void main(String args[])
	{
		ConstructureFactoryMethod gs=ConstructureFactoryMethod.createFactoryMethod("GOWRI",45,"CSE");
		
		System.out.println("Name: "+gs.name+" AGE: "+gs.age+" Department: "+gs.department);
	}
}
