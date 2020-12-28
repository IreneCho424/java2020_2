package pm4;
import java.util.Scanner;

//(실습4) 사칙연산 프로그램
//1817022 조이린

public class CalcTest{
	public static void main(String[] args) {
		System.out.println("두 정수와 연산자를 입력하세요>> ");			//정수와 연산자 입력 받아 사칙연산
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String m = scanner.next();
		
		if(m.equals("+")) {										//덧셈 위한 객체 생성
			Add add = new Add();
			add.setValue(a, b);
			int result = add.add();
			System.out.println(result);
		}
		else if(m.equals("-")) {								//뻴셈 위한 객체 생성
			Sub sub = new Sub();
			sub.setValue(a, b);
			int result = sub.sub();
			System.out.println(result);
		}
		else if(m.equals("*")) {								//곱셈 위한 객체 생성
			Mul mul = new Mul();
			mul.setValue(a, b);
			int result = mul.mul();
			System.out.println(result);
		}
		else if(m.equals("/")) {								//나눗셈 위한 객체 생성
			Div div = new Div();
			div.setValue(a, b); 
			int result = div.div();
			System.out.println(result);
		}
		else {
			System.out.println("잘못된 연산자입니다.");
		}
		
		scanner.close();
	}
}