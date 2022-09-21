package app;
/**
 * Implements a person with a first and last name
 * @author Eric Johnston
 * @version 1.0
 */
public class Person implements PersonInterface, Comparable<Person>
{
	private String firstName = "Eric";
	private String lastName = "Johnston";
	private boolean running;
	
	/**
	 * Person constructor
	 * @param firstName string
	 * @param lastName string
	 */
	public Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/**
	 * Person constructor
	 * @param person object
	 */
	public Person(Person person)
	{
		this.firstName = person.getFirstName();
		this.lastName = person.getLastName();
	}
	
	/**
	 * Get method
	 * @return this.firstName
	 */
	public String getFirstName()
	{
		return firstName;
	}
	
	/**
	 * Get method
	 * @return this.lastName
	 */
	public String getLastName()
	{
		return lastName;
	}
	
	@Override
	public boolean equals(Object other)
	{
		if(other == this)
		{
			System.out.println("I am here in other == this");
			return true;
		}
		if(other == null)
		{
			System.out.println("I am here in other == null");
			return true;
		}
		if(getClass() != other.getClass())
		{
			System.out.println("I am here in getClass() != other.getClass()");
			return false;
		}
		Person person = (Person)other;
		return (this.firstName == person.firstName && this.lastName == person.lastName);
	}
	
	@Override
	public String toString()
	{
		return "My class is " + getClass() + " " + this.firstName + " " + this.lastName;
	}

	@Override
	public void walk()
	{
		System.out.println("I am walking");
		running = false;
	}

	@Override
	public void run()
	{
		System.out.println("I am running");
		running = true;
	}

	@Override
	public boolean isRunning()
	{
		return running;
	}

	@Override
	/**
	 * Sort by last name
	 */
	public int compareTo(Person o)
	{
		int value = this.lastName.compareTo(o.lastName);
		if(value == 0)
		{
			return this.firstName.compareTo(o.firstName);
		}
		else
		{
			return value;
		}
	}
}
