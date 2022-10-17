package testing;

public class Multithread extends Thread
{
	private int threadNumber;
	
	public Multithread(int threadNumber)
	{
		this.threadNumber = threadNumber;
	}
	
	public void run()
	{
		System.out.println("Thread number " + threadNumber);
	}
}
