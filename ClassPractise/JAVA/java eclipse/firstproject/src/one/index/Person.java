package one.index;

public class Person {

	
	 String name;
	 int age;
	 
	public Person(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void display() {
		
		System.out.println("The Name of the person is:"+name);
		System.out.println("The Agr is:"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person Gs=new Person("Gowri Shankar",23);
		Person Gs1=new Person("SUbash",25);
		
		Gs.display();
		Gs1.display();
	}

}
