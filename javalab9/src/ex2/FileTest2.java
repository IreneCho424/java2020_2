package ex2;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//(예제2) 텍스트 파일 복사 예제
//1817022 조이린

public class FileTest2 {

	public static void main(String[] args) {
		File src = new File("c:\\javalab\\lab9.txt"); // 원본 파일 경로명
		File dest = new File("c:\\javalab\\\\myinfo.txt"); // 복사 파일 경로명
		int c;
		try {
			FileReader fr = new FileReader(src);
			FileWriter fw = new FileWriter(dest);
			while ((c = fr.read()) != -1) { // 문자 하나 읽고
				fw.write((char) c); // 문자 하나 쓰고
			}
			fr.close(); fw.close();
			System.out.println(src.getPath() + "를 " + dest.getPath() + "로 복사하였습니다.");
		} catch (IOException e) {
			System.out.println("파일 복사 오류");
		}
	}

}
