package app;

import java.util.Arrays;

/**
 * Implement code via main()
 * @author Eric Johnston
 * @version 1.0
 */
public class Test
{	
	public static void main(String[] args)
	{
		
		Person person1 = new Person("Tony", "Cheese");
		
		Person[] persons = new Person[4];
		persons[0] = new Person("Tony", "Cheese");
		persons[1] = new Person("Ron", "Overmeyer");
		persons[2] = new Person("Johnny", "Juiliano");
		persons[3] = new Person("Jim", "Jameson");
		
		person1.walk();
		person1.run();
		System.out.println("Person 1 is running: " + person1.isRunning());
		person1.walk();
		System.out.println("Person 1 is running: " + person1.isRunning());
		
		// Sort by last name
		Arrays.sort(persons);
		for(int x = 0; x < 4; x++)
		{
			System.out.println(persons[x]);
		}
		
	}
}
