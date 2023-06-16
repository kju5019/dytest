package ch19.sec03.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {

	public static void main(String[] args) {

		try {
			Socket socket = new Socket("10.10.12.60",50001);
			
			System.out.println("[클라이언트] 연결 성공");
			
			
			String sendMessage = "메롱 ㅋㅋ";
			DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
			dos.writeUTF(sendMessage);
			dos.flush();
			System.out.println("[클라이언트] 데이터 보냄" + sendMessage);
			
			
			DataInputStream dis = new DataInputStream(socket.getInputStream());
			String receiveMessage = dis.readUTF();
			System.out.println("[클라이언트] 데이터 받음" + receiveMessage);
			
			
			
			socket.close();
			System.out.println("[클라이언트] 연결 끊음");
		
		} catch (UnknownHostException e) {

		} catch (IOException e) {

		}

	}

}
