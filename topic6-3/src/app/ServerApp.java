package app;

/**
 * Implements a ServerApp
 * @author Eric Johnston
 * @version 1.0
 */
public class ServerApp
{

	public static void main(String args[]) throws InterruptedException
	{
		ServerThread serverThread = new ServerThread();
		
		serverThread.start();
		while(serverThread.isAlive())
		{
			System.out.println(".");
			Thread.sleep(5000);
		}
	}
}
