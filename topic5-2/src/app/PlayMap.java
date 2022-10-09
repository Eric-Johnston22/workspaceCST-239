package app;

import java.util.HashMap;
import java.util.Map;

/**
 * Implements a playmap that creates an integer, string, and name Map
 * @author Eric Johnston
 * @version 1.0
 */
public class PlayMap
{

	public static void main(String[] args)
	{
		// Create a Map of Integers keyed by Integers
		Map<Integer, Integer> integerMap = new HashMap<Integer, Integer>();
		integerMap.put(1, 1);
		integerMap.put(2, 2);
		
		// Create a Map of Strings keyed by Integers
		Map<Integer, String> stringMap = new HashMap<Integer, String>();
		stringMap.put(1, "One");
		stringMap.put(2, "Two");
		
		// Create a Map of String keyed by Strings
		Map<String, String> namegMap = new HashMap<String, String>();
		namegMap.put("FirstName", "Tony");
		namegMap.put("LastName", "Cheese");
		
		// Print out size and if a Map is empty
		System.out.printf("Integer Map Tests: size is %d and is empty %b\n", integerMap.size(), integerMap.isEmpty());
		System.out.printf("String Map Tests: size is %d and is empty %b\n", stringMap.size(), stringMap.isEmpty());
		System.out.printf("Name Map Tests: size is %d and is empty %b\n", namegMap.size(), namegMap.isEmpty());
		
		// Use a For Loop to loop over the Keys to retrieve each Map Value
		for (Map.Entry<Integer, Integer> m : integerMap.entrySet())
		{
			System.out.printf("Key: %s Value: %s\n", m.getKey(), m.getValue());
		}
		
		for (Map.Entry<Integer, String> m : stringMap.entrySet())
		{
			System.out.printf("Key: %s Value: %s\n", m.getKey(), m.getValue());
		}
		
		for (Map.Entry<String, String> m : namegMap.entrySet())
		{
			System.out.printf("Key: %s Value: %s\n", m.getKey(), m.getValue());
		}
		
		integerMap.clear();
		stringMap.remove(1);
		stringMap.clear();
		namegMap.clear();
	}

}
