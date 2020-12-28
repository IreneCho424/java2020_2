package ex2;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

//(예제2) Stack 클래스 예제 - 괄호 체크
//1817022 조이린

public class StackDemo1 {

	public static void main(String[] args) {
		Stack<String> s = new Stack<String>();
		//Scanner sc = new Scanner(System.in);
		// String d = sc.next(); //사용자에게 입력받는 경우
		String d = "{ } { ( ( { } ) ) { { ( ( ) ( ) ) } }";
		StringTokenizer dt = new StringTokenizer(d);
		int check = 0;
		while (dt.hasMoreTokens()) {
			String a = dt.nextToken();
			if (a.equals("{") || a.contentEquals("(")) { // 왼쪽 괄호인 경우
				s.push(a);
			} else { // 오른쪽 괄호인 경우
				if (s.empty() == true) {
					check = 1; // 왼쪽 괄호 부족
					break;
				} else {
					String b = s.pop(); // 스택 top 제거
					if (b.contentEquals("{") && a.contentEquals("}") || b.contentEquals("(") && a.contentEquals(")"))
						;
					else {
						check = 2; // 쌍이 맞지 않음
						break;
					}
				}
			}
		}
		// sc.close();
		switch (check) {
		case 0:
			if (!s.empty())
				System.out.println("오른쪽 괄호가 부족하다.");
			else
				System.out.println("쌍이 맞는다.");
			break;
		case 1:
			System.out.println("왼쪽 괄호가 부족하다.");
			break;
		case 2:
			System.out.println("쌍이 맞지 않는다.");
		}
	}

}
