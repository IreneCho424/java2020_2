package ex6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

//(예제6_2) User 객체를 배열로 구성하여 배열 객체 저장 예제
//1817022 조이린

public class ObjectStreamTest2 {

	public static void writeDataArr() throws IOException {
		Scanner scan = new Scanner(System.in);

		User[] arrUser = new User[5];
		FileOutputStream fileos = new FileOutputStream("userInfo.dat");
		ObjectOutputStream objectos = new ObjectOutputStream(fileos);

		for (int i = 0; i < 5; i++) {
			String id = scan.next();
			String name = scan.next();
			int age = scan.nextInt();
			User obj = new User(id, name, age);
			arrUser[i] = obj;
		}

		objectos.writeObject(arrUser);

		objectos.close();
		scan.close();
	}

	public static void readDataArr() throws IOException, ClassNotFoundException {
		FileInputStream fileis = new FileInputStream("userInfo.dat");
		ObjectInputStream objectis = new ObjectInputStream(fileis);

		User[] users = (User[]) objectis.readObject();

		for (User obj : users) {
			System.out.println(obj);
		}

		objectis.close();
	}

	public static void main(String[] args) {
		try {
			writeDataArr();
			readDataArr();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
