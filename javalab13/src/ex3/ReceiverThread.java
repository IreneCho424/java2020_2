package ex3;

//(예제3) 스레드를 이용한 1:1 채팅 - 수신을 담당하는 ReceiverThread 클래스
//1817022 조이린

import java.net.Socket;
import java.util.Scanner;

public class ReceiverThread extends Thread{
	Socket socket = null;
	
	public ReceiverThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			Scanner in = new Scanner(socket.getInputStream());
			
			while(true) {
				String str = in.nextLine();
				if(str == null) break;
				System.out.println("REC > " + str);
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
			} catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
