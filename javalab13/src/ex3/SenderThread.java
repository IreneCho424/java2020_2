package ex3;

//(예제3) 스레드를 이용한 1:1 채팅 - 수신을 담당하는 SenderThread 클래스
//1817022 조이린

import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class SenderThread extends Thread {
	Socket socket = null;
	
	public SenderThread(Socket socket) {
		this.socket = socket;
	}
	
	public void run() {
		try {
			Scanner in = new Scanner(System.in);
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			while(true) {
				String str = in.nextLine();
				if(str.equalsIgnoreCase("bye")) break;
				out.println(str);
				out.flush();
			}
			in.close();
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
