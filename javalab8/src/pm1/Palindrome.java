package pm1;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//(실습1) palindrome 식별하는 프로그램
//1817022 조이린

public class Palindrome {

	public static void main(String[] args) {
		Stack<String> palin = new Stack<String>();
		Scanner sc = new Scanner(System.in);

		System.out.println("[palindrome 검사 프로그램]");
		while (true) {
			System.out.print("문자열 입력 >> ");
			String s = sc.nextLine();
			if (s.contentEquals("0")) { // 프로그램 종료
				System.out.println("프로그램 종료");
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
		} // 전체 while문 종료
	}

}
