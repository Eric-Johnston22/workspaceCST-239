package base;

public class ShapeBase implements ShapeInterface
{
	protected int height;
	protected int width;
	protected String name;
	
	/**
	 * Constructor
	 * @param name String
	 * @param width int
	 * @param height int
	 */
	public ShapeBase(String name, int width, int height)
	{
		this.name = name;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * name getter
	 * @return name String
	 */
	public String getName()
	{
		return name;
	}
	
	@Override
	public int calculateArea()
	{
		return -1;
	}
	
}
