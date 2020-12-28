package pm1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//(실습1) 전화번호부 파일 생성 및 출력 프로그램
//1817022 조이린

public class Phone {

	public static void phoneWrite() throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("전화번호 입력 프로그램입니다.");

		File file = new File("c:\\javalab\\phone.txt");
		FileWriter fwrite = new FileWriter(file);
		while (true) {
			System.out.print("이름 전화번호 >> ");
			String line = sc.nextLine();
			if (line.contentEquals("stop"))
				break;

			fwrite.write(line, 0, line.length());
			fwrite.write("\n", 0, 1);
		}
		System.out.println(file.getPath() + "에 저장하였습니다.");
		fwrite.close();
		sc.close();
	}

	public static void phoneRead() throws IOException {
		File file = new File("c:\\javalab\\phone.txt");
		FileReader fread = new FileReader(file);
		BufferedReader bufR = new BufferedReader(fread);
		System.out.println(file.getPath() + "를 출력합니다.");
		
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
			System.out.println("파일 입출력 오류");
		}
	}
}
