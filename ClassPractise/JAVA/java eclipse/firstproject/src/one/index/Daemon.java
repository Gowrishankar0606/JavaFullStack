package one.index;

class UserThread1 extends Thread
{
	
	//Two of user thread and daemon thread.
	//the task of daemon thread will not be completed
	//program terminates as soon as user thread finishes its task
	//it will not wait for daemon thread to finish its task
	@Override
	public void run()
	{
		System.out.println("This is the user Thread");
		
	}
}

class DeamonThread extends Thread
{
	public DeamonThread()
	{
		setDaemon(true);//This thread become daemon,jvm will not run
	}
	@Override
	public void run()
	{
	for(int i=0;i<10;i++)
	{
		System.out.println("The Deamon Thread :"+i);
	}
	}
}


public class Daemon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DeamonThread daemon = new DeamonThread(); //Creating the daemon thread
		daemon.start();				//start the daemon thread
		UserThread1 userThread = new UserThread1(); //creating the user thread
		userThread.start();		//
		
	}

}
