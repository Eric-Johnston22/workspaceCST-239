package app;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Implements a playqueue that creates a string queue and an integer queue
 * @author Eric Johnston
 * @version
 */
public class PlayQueue
{

	public static void main(String[] args)
	{
		// Setup a queue of strings
		Queue<String> stringQueue = new LinkedList<String>();
		stringQueue.offer("Tony Cheese");
		stringQueue.add("Mary Cheese");
		stringQueue.offer("Thomas Cheese");
		stringQueue.add("Brianna Cheese");
		
		// Setup a queue of integers
		Queue<Integer> integerQueue = new LinkedList<Integer>();
		integerQueue.add(1);
		integerQueue.offer(-1);
		integerQueue.add(5);
		integerQueue.offer(10);
		
		// Print out size and head element of the queue
		System.out.println(integerQueue);
		System.out.printf("Integer Queue Tests: size is %d and head element is %d\n", 
						  integerQueue.size(), integerQueue.peek());
		
		// Use iterator to get elements from the queue
		Iterator<String> itr = stringQueue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
