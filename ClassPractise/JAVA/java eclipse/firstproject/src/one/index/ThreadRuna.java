package one.index;

public class ThreadRuna implements Runnable {

	
	public void run()
	{
		System.out.println("Thread is Running Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable Gs=new ThreadRuna();
		Thread GS1=new Thread(Gs,"Mythread");
		GS1.start();
		String str=GS1.getName();
		System.out.println(str);
		
	}

}
