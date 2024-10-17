package one.index;

public class ThreadImplementation implements Runnable {

	private boolean exit1;
	private String name;
	
	Thread t;
	ThreadImplementation(String threadname)
	{
		
		name=threadname;
		t=new Thread(this.name);
		System.out.println("New Thread:"+t);
		exit1=false;
		t.start();
	}
	
	public void run()
	{
		int i=0;
		while(!exit1)
		{
			System.out.println(name+":"+i);
			i++;
			try
			{
				Thread.sleep(100);
			}
			catch(InterruptedException e)
			{
				System.out.println("Caught"+e);
			}
		}
		System.out.println(name+"Stopped");
	}
	
	public void stop()
	{
		exit1=true;
	}
	public static void main(String[] args) {
		
		
		ThreadImplementation Gs=new ThreadImplementation("First Thread");
		ThreadImplementation Gs2=new ThreadImplementation("Second Thread");
		
		try {
			Thread.sleep(200);
			Gs.stop();
			Gs2.stop();
			Thread.sleep(200);
		}
		catch(InterruptedException e)
		{
			System.out.println("caught"+e);
		}
		System.out.println("Exit the main Thread");
	}
	

}
