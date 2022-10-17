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
		System.out.println("MyThread2 is running");
	}
}
