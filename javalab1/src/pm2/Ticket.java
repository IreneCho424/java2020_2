package pm2;

//(�ǽ�2) ���� ǥ �����ϱ�
//1817022 ���̸�

import java.util.Scanner;
public class Ticket{
	public static void main(String[] args) {
		System.out.println("�? û�ҳ�? ���?");
		Scanner sc = new Scanner(System.in);
		String what = sc.next();
		switch(what) {
		case "�" : 
			System.out.println("� ��� �����մϴ�.");
			break;
		case "û�ҳ�" :
			System.out.println("û�ҳ� ��� �����մϴ�.");
			break;
		case "���" :
			System.out.println("��� ��� �����մϴ�.");
			break;
		default:
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		sc.close();
	}
}