package app;

/**
 * Create a thread that extends the Thread class
 * @author Eric Johnston
 * @version 1.0
 */
public class MyThread1 extends Thread
{
	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println("MyThead1 is running iteration " + i);
			
			try
			{
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
