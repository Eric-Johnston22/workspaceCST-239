package app;

import java.util.Random;

/**
 * Implements a CounterThread that extends Thread
 * @author Eric Johnston
 * @version 1.0
 */
public class CounterThread extends Thread
{
	@Override
	public void run()
	{
		try
		{
			Random rand = new Random();
			int sleeper = rand.ints(1, (1000 + 1)).findFirst().getAsInt();
			Thread.sleep(sleeper);
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		Counter.incremet();
	}
}
