package ex6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//(예제6) User 객체 저장 사용 예제
//1817022 조이린

public class ObjectStreamTest {

	public static void writeData() throws IOException {
		User obj = new User("160001", "나이화", 22);
		FileOutputStream fileos = new FileOutputStream("userInfo.dat");
		ObjectOutputStream objectos = new ObjectOutputStream(fileos);
		objectos.writeObject(obj);

		fileos.close();
		objectos.close();
	}

	public static void readData() throws IOException, ClassNotFoundException {
		FileInputStream fileis = new FileInputStream("userInfo.dat");
		ObjectInputStream objectis = new ObjectInputStream(fileis);

		User obj = (User) objectis.readObject();

		System.out.println(obj);

		objectis.close();
	}

	public static void main(String[] args) {
		try {
			writeData();
			readData();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
