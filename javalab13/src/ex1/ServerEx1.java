package ex1;

//(����1) ������ �λ� �޽��� ���� - ���� ���α׷�
//1817022 ���̸�

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ServerEx1 {

	public static void main(String[] args) {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(9000);
			
			System.out.println("1.Waiting...");
			socket = serverSocket.accept();
			System.out.println("3.Accept");
			
			Scanner in = new Scanner(socket.getInputStream());
			PrintWriter out = new PrintWriter(socket.getOutputStream());
			
			String strIn = in.nextLine();
			System.out.println(strIn);
			
			out.println("5.Send from Server: Hello, Client!!!");
			out.flush();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				socket.close();
				serverSocket.close();
			} catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
