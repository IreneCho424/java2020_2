package ex5;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

//(예제5) HashMap 객체 저장 예제 
//1817022 조이린

public class FileTest5 {

	public static void writeData() throws IOException {
		HashMap<String, String> loginData = new HashMap<String, String>();

		FileOutputStream fout = new FileOutputStream("c:\\javalab\\logdata.dat");
		ObjectOutputStream out = new ObjectOutputStream(fout);
		Scanner scan = new Scanner(System.in);

		while (true) {
			String id = scan.next();
			String name = scan.next();
			if (id.equals("0") || name.equals("0"))
				break;

			loginData.put(id, name);
		}

		out.writeObject(loginData);
		System.out.println("파일에 저장 완료!");

		out.close();
		scan.close();
	}

	public static void readData() throws IOException, ClassNotFoundException {
		HashMap<String, String> loginData;

		FileInputStream fin = new FileInputStream("c:\\javalab\\logdata.dat");
		ObjectInputStream in = new ObjectInputStream(fin);
		Scanner scan = new Scanner(System.in);

		loginData = (HashMap<String, String>) in.readObject();

		for (String key : loginData.keySet()) {
			System.out.println("ID: " + key + ", Name: " + loginData.get(key));
		}

		in.close();
		scan.close();
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("메뉴를 선택하세요.");
		System.out.println("(1)파일에 저장 (2)파일에서 데이터 읽기");
		int menu = scan.nextInt();

		try {
			if (menu == 1)
				writeData();
			else if (menu == 2)
				readData();
		} catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
		
		System.out.println("프로그램 종료");
	}

}
