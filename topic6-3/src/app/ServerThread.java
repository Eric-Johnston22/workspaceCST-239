package app;

import java.io.IOException;

/**
 * Implements a ServerThread
 * @author Eric Johnston
 * @version 1.0
 */
public class ServerThread extends Thread
{
	public void run()
	{
		Server server = new Server();
		try
		{
			server.start(6666);
			server.cleanup();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}
}
