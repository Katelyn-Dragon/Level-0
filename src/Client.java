import java.io.IOException;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	final static String INET_ADDR = "rpi5";
	final static int PORT = 8000;

	public static void main(String[] args) throws UnknownHostException {
		// Get the multicast address that we are going to connect to.
		InetAddress address = InetAddress.getByName(INET_ADDR);

		// Create a buffer of bytes, which will be used to store
		// the incoming bytes containing the information from the streaming
		// server
		byte[] buffer = new byte[256];

		// Create a new Multicast socket so we can join the multicast group
		try (Socket clientSocket = new Socket()) {
			// Joint the Multicast group.
			InputStream data = clientSocket.getInputStream();

			// do an infinite loop
			while (true) {
				// Receive the information and print it.
				int a = data.read();

				System.out.println("Data ->  " + data);
			}
		} catch (IOException exception) {
			exception.printStackTrace();
		}
	}
}