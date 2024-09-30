package one.index;

//using the field 

public class SingleInheritance {

	float salary=60000;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Program GS=new Program();
		System.out.println("The Program salary is: "+GS.salary);
		System.out.println("The Program Bonus: "+GS.bonus);
	}

}
class Program extends SingleInheritance{
	int bonus=30000;
	
}