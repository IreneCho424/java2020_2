package ex1;

//(예제1) 간단한 인사 메시지 전송 - 클라이언트 프로그램
//1817022 조이린

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientEx1 {

	public static void main(String[] args) {
		Socket socket = null;
		String ipAddr = "localhost";
		
		try {
			socket = new Socket(ipAddr, 9000);
			System.out.println("2.Request");
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			out.println("4.Send from Client: Hello, Server!!!");
			out.flush();
			
			String strIn = in.nextLine();
			System.out.println(strIn);
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try{
				socket.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
