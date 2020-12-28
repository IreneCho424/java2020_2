package ex3;

//(����3) �����带 �̿��� 1:1 ä�� - ������ ����ϴ� SenderThread Ŭ����
//1817022 ���̸�

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
