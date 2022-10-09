package app;

/**
 * Implements class with generic method that excepts type Number
 * @author Eric Johnston
 * @version 1.0
 */
public class MyNumbersArray
{
	/**
	 * Prints all elements of an array
	 * @param <E> of type Number
	 * @param inputArray of type Number
	 */
	public <E extends Number> void printArray(E[] inputArray)
	{
		for(E element : inputArray)
		{
			System.out.printf("%s", element);
		}
	}
	
	
	public static void main(String[] args)
	{
		Integer[] intArray = {1,2,3,4,5};
		Double[] doubleArray = {1.1,2.2,3.3,4.4,5.5};
		Float[] floatArray = {0.0f, 1.0f, 2.5f, 3.5f};
		
		MyNumbersArray ma = new MyNumbersArray();
		System.out.println("Array integerArray contains: ");
		ma.printArray(intArray);
		System.out.println("\nArray doubleArray contains: ");
		ma.printArray(doubleArray);
		System.out.println("\nArray charArray contains: ");
		ma.printArray(floatArray);
	}

}
