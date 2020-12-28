package ex3;
import java.util.Scanner;

//(예제 3) 예외처리 - throws throw 사용하여 예외 처리 호출하기
//1817022 조이린

public class ExceptionTest4{
	
	public int inputData() throws Exception{
		Scanner sc = new Scanner(System.in);
		System.out.println("1~100 사이의 값을 입력하세요!");
		int val = sc.nextInt();
		if(val < 1 || val > 100) {
			throw new Exception();
		}
		sc.close();
		return val;
	}
	
	//throws 테스트
	public static void main(String[] args) {
		ExceptionTest4 et = new ExceptionTest4();
		try {
			int val = et.inputData();
			System.out.println("입력값 : " + val);
		}
		catch(Exception e) {
			System.out.println("입력값이 범위를 벗어났습니다.");
		}
	}
}