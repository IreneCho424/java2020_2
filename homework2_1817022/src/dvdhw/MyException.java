package dvdhw;

//1817022 조이린
/*
 * MyException 클래스
 * 새로 정의한 예외- 원하는 예외 처리를 하기 위해 정의
 */

public class MyException extends Exception {
	public MyException(String msg) {
		System.out.println(msg);
	}
	
}
