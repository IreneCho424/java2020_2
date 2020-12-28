package ex5;

//(예제 5) 예외처리 - 사용자 정의 예외 클래스 활용 예제
//1817022 조이린

public class ExampleException{
	
	public static void main(String[] args) {
		ExceptionTest obj = new ExceptionTest();
		try {
			obj.foo(-10);
		}
		catch(MyException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			obj.goo(-1);
		}
		catch(MyRuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		//obj.foo(-1);		//컴파일 오류 발생
		obj.goo(-1);		//예외 처리를 제대로 하지 않아 제대로 종료되지 못함
	}
}