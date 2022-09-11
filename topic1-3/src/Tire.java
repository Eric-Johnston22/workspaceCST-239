/**
 * Implements a Tire object with a PSI
 * @author Eric Johnston
 * @version 1.0
 */
public class Tire
{
	private int psi;

	/**
	 * Tire constructor
	 * @param psi of the tire
	 */
	public Tire(int psi)
	{
		this.psi = psi;
	}
	
	/**
	 * psi getter
	 * @return this.psi
	 */
	public int getPsi()
	{
		return psi;
	}

	/**
	 * psi setter
	 * @param psi
	 */
	public void setPsi(int psi)
	{
		this.psi = psi;
	}
	
}
