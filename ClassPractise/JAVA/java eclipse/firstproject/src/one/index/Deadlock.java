package one.index;

public class Deadlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final String resource1="Vikas";
		final String resource2="Manisha";

		Thread t1=new Thread()
				{
					public void run()
					{
						synchronized(resource1)
						{
							System.out.println("Thread1 locked resource1");
							try {
								Thread.sleep(100);
							}
							catch(Exception e)
							{
								
							}
							
							synchronized(resource2)
							{
								System.out.println("Thread 1 locked resources 2");
						}
					}
				}
		
		
	};

	Thread t2=new Thread()
	{
		public void run()
		{
			synchronized(resource1)
			{
				System.out.println("Thread1 locked resource2");
				try {
					Thread.sleep(100);
				}
				catch(Exception e)
				{
					
				}
				
				synchronized(resource2)
				{
					System.out.println("Thread 2 locked resources 2");
			}
		}
	}


};

t1.start();
t2.start();
}
}

