package one.index;

public class Boxing {
 
	
	// Boxing is nothing but process of converting primitive data type into object.
	// Un boxing is opposite of boxing. which converts object type back to primitive type.
	
	// Bool ---> Boolean
	//Char -->Character
	//double--->Double
	//float--->Float
	
	public static void main(String args[])
	{
		int a=10;
		Integer a2=new Integer(a);//Boxing
		Integer a3=25;
		System.out.println(a2+" "+a3);
		
		//write a program to create a interface shape with the getArea() method. 
		//Create three classes rectangle, circle and triangle that implement the shape interface
		//implement the getArea method for each of the class method  
	}
	
} 
