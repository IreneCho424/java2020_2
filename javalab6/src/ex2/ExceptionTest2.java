package ex2;

//(예제2) 예외처리-try catch 사용 예제
//1817022 조이린

public class ExceptionTest2{
	//예외 처리 : 정수를 0으로 나눔
	public static void main(String[] args) {
		
		int num = Integer.parseInt(args[0]);
		try {
			int result = 10 / num;
			System.out.println("result = " + result);
		}
		catch(ArithmeticException e){
			System.out.println("정수를 0으로 나누면 안돼요.");
		}
		System.out.println("프로그램 계속 실행됨");
	}
}