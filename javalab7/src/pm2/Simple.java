package pm2;

import java.util.Scanner;

//(�ǽ�2-simple) �Է¹��� ���ڿ��� ������ �迭�� ��� �� ���� ���
//1817022 ���̸� 

public class Simple {
	public static void main(String[] args) {

		try {
			Scanner scan = new Scanner(System.in);
			int row = scan.nextInt();
			int col = scan.nextInt();
			char[][] arr = new char[row][col];

			String[] temp = new String[row];
			for (int i = 0; i < row; i++) {
				temp[i] = scan.next();
				temp[i] = temp[i].trim();
			}

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					arr[i][j] = temp[i].charAt(j);
				}
			}

			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					System.out.print(arr[i][j]);
				}
				System.out.println();
			}
			scan.close();
		} catch (Exception e) {	//���� ó��
			System.out.println("���ڸ� �Է��ϼ���");
		}
	}
}
