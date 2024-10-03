package one.index;

public class ArrayofObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student[] arr;
		arr=new Student[3];
		arr[0]=new Student(100,"Malar");
		arr[1]=new Student(101,"Mohan");
		arr[2]=new Student(102,"Malavika");
		
		
		System.out.println("Student data arr ");
		arr[0].display();
		
		System.out.println("Student data arr0");
		arr[1].display();
		
		System.out.println("Student data arr0");
		arr[2].display();
		
		
	}

}

class Student {
	public int id;
	public String name;
	Student(int id, String name)
	{
		this.id=id;
		this.name=name;
		
	}
	
	
	public void display()
	{
		System.out.println("Student id is"+id+"name" +name);
	}

	}

