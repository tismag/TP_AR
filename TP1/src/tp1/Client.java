package tp1;

import java.io.*;
import java.net.*;

public class Client {

	public Client() {}
	
	public static void main(String[] args) throws IOException{
		String serverHost = "localhost";
		int serverPort = 9999;
		
		Socket soc = new Socket(serverHost,serverPort);
		
		DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
		dos.writeUTF("Client");
		
		DataInputStream dis = new DataInputStream(soc.getInputStream());
		String response = dis.readUTF();
		
		System.out.println(response);
		
		soc.close();
	}
}
