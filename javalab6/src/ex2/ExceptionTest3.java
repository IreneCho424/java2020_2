package ex2;

//(예제2) 예외처리 -try catch finally 사용 예제
//1817022 조이린

public class ExceptionTest3{
	//예외 처리 : 여러 개의 예외 처리 and finally 테스트
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			int result = 10/num;
			System.out.println("result = " + result);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("인자를 하나 입력해 주세요");
		}
		catch(NumberFormatException e) {
			System.out.println("인자를 정수 타입으로 입력해주세요");
		}
		catch(ArithmeticException e) {
			System.out.println("정수를 0으로 나누면 안돼요");
		}
		finally {
			System.out.println("반드시 실행될 영역");
		}
	}
}