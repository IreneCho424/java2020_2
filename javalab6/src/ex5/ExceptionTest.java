package ex5;

//(예제 5) 사용자 정의 예외 클래스들
//1817022 조이린

class MyException extends Exception{
	public String getMessage() {
		return "Negative Integer!!!";
	}
}

class MyRuntimeException extends RuntimeException{
	//예외 메시지를 외부에서 입력 받아 사용
	public MyRuntimeException(String errmsg) {
		super(errmsg);
	}
}

class ExceptionTest{
	//foo()라는 메서드를 호출했을 때
	//MyException 예외가 날 수 있으니 이를 처리(호출한 곳으로 던짐)
	public void foo(int n) throws MyException{
		if(n<0) throw new MyException();
		else System.out.println("foo(int) : " + n);
	}
	
	//goo()라는 메서드를 호출했을 때
	//MyRuntimeException 예외가 날 수 있으니 이를 처리(호출한 곳으로 던짐)
	public void goo(int n) throws MyRuntimeException{
		if(n<0) throw new MyRuntimeException("음수가 매개변수로 들어올 수 없다.");
		else System.out.println("goo(int) : " + n);
	}
}