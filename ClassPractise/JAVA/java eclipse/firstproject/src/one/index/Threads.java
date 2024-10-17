package one.index;

public class Threads extends Thread {
	
	
	public static void main(String[] args) {
		//Thread is a direction or path that is taken while the program is being executed.
		//Life Cycle of thread .Following state is excited in the 
		//1.new(constructing) start the thread by intializing the obj in the class
		//2.Runnable(prepared to execute the code in interface)
		//3.Running (thread for execution with/without time slot  )
		//4.Blocked (in active )
		//5.Dead/terminated (Thread run and exit process)
		
		//How the Thread is implemented 
		  //it can implement in two types
		  //1.extends Thread (Class)
		//2.implements runnable(interface)
		
		Threads Gs=new Threads();
		Gs.start();
		
		System.out.println("The code run outside the Thread");

	}
	public void run()
	{
		System.out.println("The code is running in the thread:");
	}

}
