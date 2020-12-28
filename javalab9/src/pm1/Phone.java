package pm1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//(�ǽ�1) ��ȭ��ȣ�� ���� ���� �� ��� ���α׷�
//1817022 ���̸�

public class Phone {

	public static void phoneWrite() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȭ��ȣ �Է� ���α׷��Դϴ�.");

		File file = new File("c:\\javalab\\phone.txt");
		FileWriter fwrite = new FileWriter(file);
		while (true) {
			System.out.print("�̸� ��ȭ��ȣ >> ");
			String line = sc.nextLine();
			if (line.contentEquals("stop"))
				break;

			fwrite.write(line, 0, line.length());
			fwrite.write("\n", 0, 1);
		}
		System.out.println(file.getPath() + "�� �����Ͽ����ϴ�.");
		fwrite.close();
		sc.close();
	}

	public static void phoneRead() throws IOException {
		File file = new File("c:\\javalab\\phone.txt");
		FileReader fread = new FileReader(file);
		BufferedReader bufR = new BufferedReader(fread);
		System.out.println(file.getPath() + "�� ����մϴ�.");
		
		String line = "";
		while((line = bufR.readLine()) != null) {
			System.out.println(line);
		}
		
		bufR.close();
	}

	
	public static void main(String[] args) {
		try {
			phoneWrite();
			phoneRead();
		} catch (IOException e) {
			System.out.println("���� ����� ����");
		}
	}
}
