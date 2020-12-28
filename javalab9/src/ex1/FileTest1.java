package ex1;

import java.io.File;

//(예제1) File 클래스 - 디렉토리 검색 및 생성 등
//1817022 조이린

public class FileTest1 {

	public static void main(String[] args) {
		System.out.println("c: 드라이브의 전체 파일 출력");

		File file = new File("C:\\");
		String[] files = file.list();

		for (String fileName : files) {
			File subFile = new File(file, fileName);

			if (subFile.isDirectory())
				System.out.println("디렉토리 이름 : " + fileName);
			else
				System.out.println("파일 이름 : " + fileName + ", 파일 크기 : " + subFile.length() + "byte");
		}

		File makedir = new File("c:\\data");
		if (!makedir.exists())
			System.out.println("makedir이 없음");

		makedir.mkdir();
		if (makedir.exists())
			System.out.println("makedir이 생성됨");

		File renamedir = new File("c:\\newdata");
		makedir.renameTo(renamedir);

		if (renamedir.exists())
			System.out.println("makedir의 이름이 변경됨");
		if (renamedir.delete())
			System.out.println("renamedir이 제거됨");
	}

}
