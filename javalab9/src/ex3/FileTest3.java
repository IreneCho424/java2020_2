package ex3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//(예제3) 이미지를 복사하는 예제
//1817022 조이린

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
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
