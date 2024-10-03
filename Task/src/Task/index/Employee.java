package Task.index;

public class Employee {

	String name,jobtitle;
	int salary;
	
	public Employee(String name, String jobtitle, int salary)
	{
		this.name=name;
		this.jobtitle=jobtitle;
		this.salary=salary;
	}
	
	public void disply()
	{
		System.out.println("Employee Name: "+name);
		System.out.println("Job Title: "+jobtitle);
		System.out.println("Salary: "+salary);
	}
	
	
	public static void main (String args[])
	{
		Employee GS=new Employee("Gowri Shankar","Software Developer",50000);
		GS.disply();
		
		
		
	}
}
