package ex4;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

//(����4) ���� ��Ʈ���� �̿��� ���
//1817022 ���̸�

public class FileTest4 {

	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("c:\\javalab\\test.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out, 5);
			while((c = fin.read()) != -1) {
				out.write(c);
			}
			
			//���� �����Ͱ� ��� ��µ� ����
			new Scanner(System.in).nextLine();  //<Enter> Ű ��ٸ�
			
			out.flush(); //���ۿ� �����ִ� ���� ��� ��� <Enter> Ű ������ ������ ���ڰ� ȭ�鿡 ���(������ ���)
			fin.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
