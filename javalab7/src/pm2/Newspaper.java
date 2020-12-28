package pm2;

import java.util.Scanner;

//(실습2) 신문 기사 글자 확대
//1817022 조이린 

public class Newspaper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row1 = scan.nextInt();
		int col1 = scan.nextInt();
		int row2 = scan.nextInt();
		int col2 = scan.nextInt();

		// 내용 입력받기
		System.out.println("type news : ");
		String[] temp = new String[row1];
		for (int i = 0; i < row1; i++) {
			temp[i] = scan.next();
			temp[i] = temp[i].trim();
		}

		// 입력받은 내용을 char 단위로 다시 저장
		char[][] news1 = new char[row1][col1];
		for (int i = 0; i < news1.length; i++) {
			for (int j = 0; j < news1[i].length; j++) {
				news1[i][j] = temp[i].charAt(j);
			}
		}
		// 확대하여 출력
		
		for (int i = 0; i < row1; i++) {
			int i1 = 0;
			while (i1 < row2) {
				for (int j = 0; j < col1; j++) {
					int j1 = 0;
					while (j1 < col2) {
						System.out.print(news1[i][j]);
						j1++;
					}
				}
				i1++;
				System.out.println();
			}
		}
		
		scan.close();

	}

}
