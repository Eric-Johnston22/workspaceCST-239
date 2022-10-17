package testing;

import java.util.HashMap;
import java.util.Map;

public class Test
{
	public static class Multithread extends Thread
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
	
	public static void main(String[] args)
	{
		for (int i = 0; i < 1000000; i++)
		{
			Multithread myThread = new Multithread(i);
			myThread.start();
		}
	}
}