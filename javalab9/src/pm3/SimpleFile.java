package pm3;

import java.io.File;
import java.util.Scanner;

//(실습3) 간단한 파일탐색기
//1817022 조이린

public class SimpleFile {
	public static void main(String[] args) {
		File file = new File("c:\\");
		Scanner scan = new Scanner(System.in);
		System.out.println("*****파일 탐색기입니다. *****");
		int flag = 1;
		String[] files = file.list();

		while (flag == 1) {
			System.out.println("[" + file.getPath() + "]");
			for (String fileName : files) {
				File subFile = new File(file, fileName);
				if (subFile.isDirectory()) {
					System.out.println("dir \t\t" + subFile.length() + "바이트 \t\t" + subFile.getName());
				} else {
					System.out.println("file \t\t" + subFile.length() + "바이트 \t\t" + subFile.getName());
				}
			}
			System.out.print(">> ");
			String move = scan.next();
			if (move.contentEquals("그만")) flag = 0;
			else if(move.contentEquals("..")) {
				file = new File(file.getParent());
				files = file.list();
				continue;
			}
			else {
				file = new File(file + "\\" + move);
				System.out.println(file);
				files = file.list();
				continue;
			}
		}
		
		scan.close();

	}
}
