package pm1;

//(�ǽ�1) ����, ȭ�� �µ� ��ȯ
//1817022 ���̸�

import java.util.Scanner;
public class TempChange{
	public static void main(String[] args) {
		System.out.println("���� �Ǵ� ȭ�� �µ��� �Է��ϼ��� : ");
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		String typeT = sc.next();
		switch(typeT) {
		case "����" : 
			temp = sc.nextDouble();
			temp = temp * 9.0 / 5.0 + 32.0;
			System.out.println("ȭ�� �µ��� "+ temp);
			break;
		case "ȭ��" :
			temp = sc.nextDouble();
			temp = (temp - 32.0) * 5.0 / 9.0;
			System.out.println("���� �µ��� "+ temp);
			break;
		}
		sc.close();
	}
}