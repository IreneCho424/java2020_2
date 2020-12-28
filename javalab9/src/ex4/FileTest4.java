package ex4;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileReader;

//(예제4) 버퍼 스트림을 이용한 출력
//1817022 조이린

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
			
			//파일 데이터가 모두 출력된 상태
			new Scanner(System.in).nextLine();  //<Enter> 키 기다림
			
			out.flush(); //버퍼에 남아있던 문자 모두 출력 <Enter> 키 누르면 나머지 문자가 화면에 출력(강제로 출력)
			fin.close();
			out.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
