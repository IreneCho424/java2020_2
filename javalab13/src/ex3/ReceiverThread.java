package ex3;

//(����3) �����带 �̿��� 1:1 ä�� - ������ ����ϴ� ReceiverThread Ŭ����
//1817022 ���̸�

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
