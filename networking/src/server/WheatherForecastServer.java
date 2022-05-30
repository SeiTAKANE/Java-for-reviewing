package server;
import java.io.*;
import java.net.*;

public class WheatherForecastServer {
	static String[] weathers = {"晴れ","曇り","雨",
			"晴れのち曇り","晴れのち雨","曇りのち晴れ"};
	public static void main(String[] args) {
		try {
			ServerSocket serverSocket = new ServerSocket(5001);
			while(true) {
				Socket socket = serverSocket.accept();
				PrintWriter writer = new PrintWriter(socket.getOutputStream());
				String weather = getWeatherForecast();
				writer.println(weather);
				writer.close();
				System.out.println("[" + weather + "]の予報を送りました");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
	}
	static String getWeatherForecast() {
		return weathers[(int) (Math.random()*weathers.length)];
	}
}
