package ex2;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//(����2) Stack Ŭ���� ���� - ��ȣ üũ
//1817022 ���̸�

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		//Scanner sc = new Scanner(System.in);
		// String d = sc.next(); //����ڿ��� �Է¹޴� ���
		String d = "{ } { ( ( { } ) ) { { ( ( ) ( ) ) } }";
		StringTokenizer dt = new StringTokenizer(d);
		int check = 0;
		while (dt.hasMoreTokens()) {
			String a = dt.nextToken();
			if (a.equals("{") || a.contentEquals("(")) { // ���� ��ȣ�� ���
				s.push(a);
			} else { // ������ ��ȣ�� ���
				if (s.empty() == true) {
					check = 1; // ���� ��ȣ ����
					break;
				} else {
					String b = s.pop(); // ���� top ����
					if (b.contentEquals("{") && a.contentEquals("}") || b.contentEquals("(") && a.contentEquals(")"))
						;
					else {
						check = 2; // ���� ���� ����
						break;
					}
				}
			}
		}
		// sc.close();
		switch (check) {
		case 0:
			if (!s.empty())
				System.out.println("������ ��ȣ�� �����ϴ�.");
			else
				System.out.println("���� �´´�.");
			break;
		case 1:
			System.out.println("���� ��ȣ�� �����ϴ�.");
			break;
		case 2:
			System.out.println("���� ���� �ʴ´�.");
		}
	}

}
