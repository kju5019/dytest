package ch19.sec03.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExample {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("10.10.12.56",50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		
		} catch (UnknownHostException e) {

		} catch (IOException e) {

		}

	}

}
