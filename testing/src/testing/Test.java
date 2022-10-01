package testing;

public class Test
{
	public static void changeInt(int x)
	{
		x++;
		System.out.println("x inside changeInt() " + x);
	}
	
	public static void main(String[] args)
	{
		int x = 12;
		changeInt(x);
		System.out.println("x after method call: " + x);
	}
}