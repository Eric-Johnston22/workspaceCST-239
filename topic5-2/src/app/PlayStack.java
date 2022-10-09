package app;

import java.util.Iterator;
import java.util.Stack;

/**
 * Implements a playstack that creates a string stack and an integer stack
 * @author Eric Johnston
 * @version
 */
public class PlayStack
{

	public static void main(String[] args)
	{
		// Setup a stack of strings
		Stack<String> stringStack = new Stack<String>();
		stringStack.push("Tony Cheese");
		stringStack.push("Mary Cheese");
		stringStack.push("Thomas Cheese");
		stringStack.push("Brianna Cheese");
		
		// Setup a stack of integers
		Stack<Integer> integerStack = new Stack<Integer>();
		integerStack.push(1);
		integerStack.push(-1);
		integerStack.push(5);
		integerStack.push(10);
		
		// Print out size and head element of the Stack
		System.out.println(integerStack);
		System.out.printf("Integer Stack Tests: size is %d and 2nd element is %d\n", 
						  integerStack.size(), integerStack.elementAt(1));
				
		Iterator<String> itr = stringStack.iterator();
		while(itr.hasNext())
		{
			System.out.println(stringStack.pop());
		}
	}

}
