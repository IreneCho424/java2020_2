package ex3;

//(예제3) 스레드를 이용한 1:1 채팅 - 클라이언트 프로그램
//1817022 조이린

import java.net.Socket;

public class ClientEx3 {

	public static void main(String[] args) {
		Socket socket = null;
		
		try {
			socket = new Socket("localhost", 9001);
			
			Thread thread1 = new SenderThread(socket);
			Thread thread2 = new ReceiverThread(socket);
			thread1.start();
			thread2.start();
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
