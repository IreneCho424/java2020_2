package pm2;

import java.util.Scanner;

//(�ǽ�2) �Ź� ��� ���� Ȯ��
//1817022 ���̸� 

public class Newspaper {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row1 = scan.nextInt();
		int col1 = scan.nextInt();
		int row2 = scan.nextInt();
		int col2 = scan.nextInt();

		// ���� �Է¹ޱ�
		System.out.println("type news : ");
		String[] temp = new String[row1];
		for (int i = 0; i < row1; i++) {
			temp[i] = scan.next();
			temp[i] = temp[i].trim();
		}

		// �Է¹��� ������ char ������ �ٽ� ����
		char[][] news1 = new char[row1][col1];
		for (int i = 0; i < news1.length; i++) {
			for (int j = 0; j < news1[i].length; j++) {
				news1[i][j] = temp[i].charAt(j);
			}
		}
		// Ȯ���Ͽ� ���
		
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
