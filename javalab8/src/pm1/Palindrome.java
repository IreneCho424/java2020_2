package pm1;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//(�ǽ�1) palindrome �ĺ��ϴ� ���α׷�
//1817022 ���̸�

public class Palindrome {

	public static void main(String[] args) {
		Stack<String> palin = new Stack<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("[palindrome �˻� ���α׷�]");
		while (true) {
			System.out.print("���ڿ� �Է� >> ");
			String s = sc.nextLine();
			if (s.contentEquals("0")) { // ���α׷� ����
				System.out.println("���α׷� ����");
				sc.close();
				return;
			}

			// ----------------------------------------------

			StringTokenizer st = new StringTokenizer(s);
			int check = 0;

			while (st.hasMoreTokens()) {
				String a = st.nextToken();
				if (a.contentEquals("#")) {
					break;
				} else {
					palin.push(a);
				}
			}

			while (st.hasMoreTokens()) {
				String b = st.nextToken();
				String c = palin.pop();
				if (b.contentEquals(c))
					;
				else {
					check = 1;
					break;
				}
			}
			
			switch (check) {
			case 0:
				if (!palin.empty())
					System.out.println("No");
				else
					System.out.println("Yes");
				break;
			case 1:
				System.out.println("No");
				break;
			}
			sc = new Scanner(System.in);
		} // ��ü while�� ����
	}

}
