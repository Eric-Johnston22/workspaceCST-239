package app;

/**
 * Implements a generic class Storage
 * @author Eric Johnston
 * @version 1.0
 * @param <T>
 */
public class Storage<T>
{
	private T s = null;
	
	public Storage(T s)
	{
		this.s = s;
	}
	
	public T getData()
	{
		return this.s;
	}
	
	public static void main(String[] args)
	{
		Storage<String> storage1 = new Storage<String>("Tony Cheese");
		System.out.println("This is data " + storage1.getData());
		Storage<Integer> storage2 = new Storage<Integer>(0);
		System.out.println("This is data " + storage2.getData());
	}

}
