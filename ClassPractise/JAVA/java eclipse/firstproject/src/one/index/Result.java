package one.index;

class One1{
	
	public void printone()
	{
		System.out.print("Print one");
	}
}

class Two2 extends One1{
	public void printtwo(){
		System.out.print("Print Two");
	}
}

class Three extends Two2{
	public void printthree(){
		System.out.print("Print Three");
	}
}

//multiple interface one class can have more than one super class and inherit features from all parent class
//java does not multiple inhertitance with classes we can achieve through interface 

//interface is the reference type that specifis A class behaviour by providing abstract type
//used to acheieve abstraction polymorphisum 
//cannot be instantiated(Cannot create the class) but can be implemented by the class 
public class Result {
 public static void main(String args[])
 {
	 
 
	Three GS=new Three();
	GS.printone();
	GS.printtwo();
	GS.printthree();
	
 }	
}
