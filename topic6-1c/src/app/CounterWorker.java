package app;

/**
 * Implements a CounterWorker that holds main()
 * @author Eric Johnston
 * @version 1.0
 */
public class CounterWorker
{

	public static void main(String[] args) throws InterruptedException
	{
		System.out.println("This is the initial value of the Counter " + Counter.getCount());

		int numberCounters = 1000;
		
		CounterThread[] counters = new CounterThread[numberCounters];
		for (int i = 0; i < 1000; i++)
		{
			counters[i] = new CounterThread();
		}
		
		for (int i = 0; i < 1000; i++)
		{
			counters[i].start();
		}
		
		for (int i = 0; i < 1000; i++)
		{
			counters[i].join();
		}
		
		System.out.println("This is the end value of the Counter " + Counter.getCount());
	}

}
