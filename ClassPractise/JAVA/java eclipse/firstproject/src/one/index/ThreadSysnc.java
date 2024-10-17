package one.index;


class Book implements Runnable
{
	@Override 
	public void run()
	{
System.out.println("Do a Task");
}
	}
public class ThreadSysnc  {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t2=new Thread (new Book(),"Book thread");
		t2.start();
		System.out.println("Thread with name:"+t2.getName());
	}

}
