package ex2;

//(����2) 1:1 ä�� ���α׷� - Ŭ���̾�Ʈ ���α׷�
//1817022 ���̸�

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ClientEx2 {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		Scanner scanner = new Scanner(System.in);
		try {
			socket = new Socket("localhost", 9999); //Ŭ���̾�Ʈ ���� ����. ������ �ٷ� ����
			in = new BufferedReader(new InputStreamReader(socket.getInputStream())); //���� �Է� ��Ʈ��
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())); //���� ��� ��Ʈ��
			while(true) {
				System.out.println("������>>"); //������Ʈ
				String outputMessage = scanner.nextLine(); //Ű���忡�� �� ���� ���ڿ� ����
				if(outputMessage.equalsIgnoreCase("bye")) {
					out.write(outputMessage + "\n");
					out.flush();
					break; //����ڰ� "bye"�� �Է��� ��� ������ ���� �� ���� ����
				}
				out.write(outputMessage + "\n"); //Ű���忡�� ���� ���ڿ� ����
				out.flush();
				String inputMessage = in.readLine(); //�����κ��� �� �� ����
				System.out.println("����: " + inputMessage); //�����κ��� ���� �޽����� ȭ�鿡 ���
			}
		} catch(IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				scanner.close(); //scanner �ݱ�
				if(socket != null) socket.close(); //Ŭ���̾�Ʈ socket �ݱ�
			} catch(IOException e) {
				System.out.println("������ ä�� �� ������ �߻��߽��ϴ�.");
			}
		}
	}

}