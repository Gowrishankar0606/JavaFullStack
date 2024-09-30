package one.index;

interface One2{
	public void printone();
}

interface Two3{
	
	public void printtwo();
}

interface Three4 extends One2,Two3
{
	public void printthree();
}

class Child implements Three4
{
	
	@Override
	public void printone()
	{
		System.out.println("Print one from class One.");
	}
	
	public void printtwo()
	{
		System.out.println("Print Two from class Two.");
	}
	public void printthree()
	{
		System.out.println("Print Two from class Three.");
	}
}
public class Interface {
	public static void main(String args[]) {
		Child c=new Child();
		c.printone();
		c.printtwo();
		c.printthree();
	}
}
