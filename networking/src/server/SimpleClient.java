package server;
import java.io.*;
import java.net.*;

public class SimpleClient {
	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 5000);
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(socket.getInputStream()));
			String message = reader.readLine();
			System.out.println("サーバーから受け取った文字列:"+message);
			reader.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}
