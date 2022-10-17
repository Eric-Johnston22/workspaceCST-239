package app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Implements a Server that awaits client connection
 * @author Eric Johnston
 * @version 1.0
 */
public class Server
{
	private ServerSocket serverSocket;
	private Socket  clientSocket;
	private PrintWriter out;
	private BufferedReader in;
	
	/**
	 * Starts server
	 * @param port
	 * @throws IOException
	 */
	public void start(int port) throws IOException
	{
		System.out.println("Waiting for a client connection...");
		serverSocket = new ServerSocket(port);
		clientSocket = serverSocket.accept();
		
		System.out.println("Recieved a client connection on port " + clientSocket.getLocalPort());
		out = new PrintWriter(clientSocket.getOutputStream(), true);
		in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
		
		String inputLine;
		
		while((inputLine = in.readLine()) != null)
		{
			if (".".equals(inputLine))
			{
				System.out.println("Got a message to shut the server down");
				out.println("QUIT");
				break;
			}
			else
			{
				System.out.println("Got a message of: " + inputLine);
				out.println("OK");
			}
		}
		System.out.println("Server is shut down");
	}
	
	/**
	 * Closes I/O and client and server socket
	 * @throws IOException
	 */
	public void cleanup() throws IOException
	{
		in.close();
		out.close();
		clientSocket.close();
		serverSocket.close();
	}

	public static void main(String[] args) throws IOException
	{
		Server server = new Server();
		server.start(6666);
		server.cleanup();

	}

}
