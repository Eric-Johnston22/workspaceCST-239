package testing;

import java.util.HashMap;
import java.util.Map;

public class Test<T>
{
	
	public static <T> void printGenericArr(T[] arr)
	{
		for (T i : arr)
		{
			System.out.println(i);
		}
	}
	
	public static void main(String[] args)
	{
		Map m = new HashMap();
		m.put(null, "Test");
		m.put(null, "Fest");
	}
}