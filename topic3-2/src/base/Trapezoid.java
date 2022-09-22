package base;

/**
 * Implements a trapezoid with base1 and base2
 * @author Eric Johnston
 * @version 1.0
 */
public class Trapezoid extends ShapeBase
{
	private int base1;
	private int base2;
	
	public Trapezoid(String name, int width, int height, int base1, int base2)
	{
		super(name, width, height);
		this.base1 = base1;
		this.base2 = base2;
	}
	
	public int calculateArea()
	{
		return (int) (((base1 + base2) * height) / 2);
	}
}
