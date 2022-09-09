/**
 * This class implements a person with an age, name, and weight that can walk, run, and jump
 * @author Eric Johnston
 * @version 1.0
 */
public class Person 
{
	private int age;
	private String name;
	private float weight;
	
	/**
	 * This constructs a person object with an age, name, and weight
	 * @param age the age of the person
	 * @param name the name of the person
	 * @param weight the weight of the person
	 */
	public Person(int age, String name, float weight)
	{
		super();
		this.age = age;
		this.name = name;
		this.weight = weight;
	}
	
	/**
	 * Age getter
	 * @return this.age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * Age setter
	 * @param age
	 */
	public void setAge(int age)
	{
		this.age = age;
	}

	/**
	 * Name getter
	 * @return this.name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Name setter
	 * @param name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Weight getter
	 * @return this.name
	 */
	public float getWeight()
	{
		return weight;
	}

	/**
	 * Weight setter
	 * @param weight
	 */
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
	
	/**
	 * Print to console that walk() method is called
	 */
	public void walk()
	{
		System.out.println("I am in walk()");
	}
	
	/**
	 * Print to console that run() method is called and return distance walked
	 * @param distance to run
	 * @return distance ran
	 */
	public int run(int distance)
	{
		System.out.println("I am in run()");
		return distance;
	}

	/**
	 * Print to console that jump() method is called and return height jumped
	 * @param height to jump
	 * @return height jumped
	 */
	public int jump(int height)
	{
		System.out.println("I am in jump()");
		return height;
	}
	

	/*
	 * The main method displays output to the console first by creating a new instance of the person class.
	 * It then uses System.out.println() to display the name via the getName() method.
	 * It then calls the walk(), run(), and jump() methods. 
	 * Inside these 3 methods, System.out.println() is called to display text to the console.
	 */
	public static void main(String[] args) 
	{
		Person person = new Person(30, "Eric", (float) 184.5);
		System.out.println("My name is " + person.getName());
		person.walk();
		person.run(10);
		person.jump(2);
	}
}
