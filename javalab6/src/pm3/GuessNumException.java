package pm3;

//(실습3) 사용자 정의 예외 처리 클래스 - 숫자 입력에 대한 예외 처리
//1817022 조이린

public class GuessNumException extends Exception{
	
	public GuessNumException() {}
	
	public String getMessage() {
		return("Number should be between 1~6\nTry again");
	}
}