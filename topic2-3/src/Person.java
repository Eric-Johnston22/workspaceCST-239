/**
 * Implements a person with a first and last name
 * @author Eric Johnston
 * @version 1.0
 */
public class Person
{
	private String firstName = "Eric";
	private String lastName = "Johnston";
	
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
}
