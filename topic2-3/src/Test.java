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
		Person person2 = new Person("Ron", "Overmeyer");
		Person person3 = new Person(person1);
		
		// Test object equality
		if(person1 == person2)
		{
			System.out.println("These persons are identical using ==");
		}
		else
		{
			System.out.println("These persons are not identical using ==");
		}
		
		// Test object equality
		if(person1.equals(person2))
		{
			System.out.println("These persons are identical using equals()");
		}
		else
		{
			System.out.println("These persons are not identical using equals()");
		}
		
		// Test copy constructor
		if(person1.equals(person3))
		{
			System.out.println("These copied persons are identical using equals()");
		}
		else
		{
			System.out.println("These copied persons are not identical using equals()");
		}
		
		// Print the objects
		System.out.println(person1);
		System.out.println(person2.toString());
		System.out.println(person3);
	}
}
