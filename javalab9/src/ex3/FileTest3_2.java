package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//(����3_2) ���� ���� 3�� ���۸� �̿��Ͽ� ������� �����ϴ� ����
//1817022 ���̸�

public class FileTest3_2 {

	public static void main(String[] args) {
		File src = new File("c:\\javalab\\img1.jpg");
		File dest = new File("c:\\javalab\\desert.jpg");
		try {
			FileInputStream fi = new FileInputStream(src);
			FileOutputStream fo = new FileOutputStream(dest);
			byte[] buf = new byte[1024*10]; //10KB ����
			while(true) {
				int n = fi.read(buf); //���� ũ�⸸ŭ �б�. n�� ���� ���� ����Ʈ
				fo.write(buf, 0, n); //buf[0]���� n����Ʈ ����
				if(n<buf.length)
					break;
			}
			fi.close();
			fo.close();
			System.out.println(src.getPath() + "�� " + dest.getPath() + "�� �����Ͽ����ϴ�. ");
		} catch (IOException e) {
			System.out.println("���� ���� ����");
		}
	}

}
