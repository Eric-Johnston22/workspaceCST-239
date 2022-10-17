package app;

/**
 * Create a thread that implements the Runnable interface
 * @author Eric Johnston
 * @version 1.0
 */
public class MyThread2 implements Runnable
{
	@Override
	public void run()
	{
		for (int i = 0; i < 1000; i++)
		{
			System.out.println("MyThead2 is running iteration " + i);
			
			try
			{
				Thread.sleep(500);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
