package pm6;

//(�ǽ�6) ������� ���� ã��
//1817022 ���̸�

import java.util.Scanner;
public class Common{
	public static void main(String[] args) {
		System.out.println("�� ���� ���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			if((i+1) % num1 == 0 && (i+1) % num2 == 0) {
				count += 1;
			}
		}
		sc.close();
		System.out.printf("�� ���� ����� ������ %d�Դϴ�.\n", count);
	}
}