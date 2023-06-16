package ch19.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;

import org.json.JSONObject;

//클라이언트와 1:1로 통신하는 역할
public class SocketClient {
	ChatServer chatServer;
	Socket socket;
	DataInputStream dis;
	DataOutputStream dos;
	String clientIp;
	String chatName;
	
	//생성자
	public SocketClient(ChatServer chatServer, Socket socket) {
		try {
			this.chatServer = chatServer;
			this.socket = socket;
			this.dis = new DataInputStream(socket.getInputStream());
			this.dos = new DataOutputStream(socket.getOutputStream());
			InetSocketAddress isa = (InetSocketAddress)socket.getRemoteSocketAddress();
			this.clientIp = isa.getHostName();
			receive();
		}catch(IOException e) {
			
		}
	}

	//JSON 받기
	private void receive() {
		chatServer.threadPool.execute(() -> {
			try {
				while(true) {
					String receiveJson = dis.readUTF();
					
					JSONObject jsonObject = new JSONObject(receiveJson);
					String command = jsonObject.getString("command");
					
					switch(command) {
					case "incoming":
						this.chatName = jsonObject.getString("data");
						chatServer.sendToAll(this, "들어오셨습니다.");
						chatServer.addSocketClient(this);
						break;
					case "message" :
						String message = jsonObject.getString("data");
						chatServer.sendToAll(this, message);
						break;
					}
				}
				
			}catch(IOException e) {
				chatServer.sendToAll(this, "나가셨습니다.");
				chatServer.removeSocketClient(this);
			}
		});
		
	}
	
	//JSON 보내기
	public void send(String json) {
		try {
			dos.writeUTF(json);
			dos.flush();
		}catch(IOException e) {}
	}
	
	//연결 종료
	public void close() {
		try {
			socket.close();
		}catch(IOException e) {}
	}

}
