package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//(����3) �̹����� �����ϴ� ����
//1817022 ���̸�

public class FileTest3 {

	public static void main(String[] args) {
		File src = new File("c:\\javalab\\img1.jpg");
		File dest = new File("c:\\javalab\\Spider-Man.jpg");
		int c;
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			while((c=fi.read()) != -1) {
				fo.write((byte)c);
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�.");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}
