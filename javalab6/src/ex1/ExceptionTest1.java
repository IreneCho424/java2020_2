package ex1;

//(예제 1) 예외발생을 알아보는 예제
//1817022 조이린

public class ExceptionTest1{
	
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int result = 10/num;
		
		System.out.println("result = " + result);
		
		System.out.println("프로그램 계속 실행??");
	}
}