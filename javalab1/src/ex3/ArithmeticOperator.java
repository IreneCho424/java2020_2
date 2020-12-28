package ex3;

//(예제3) 산술 연산 ;정수(몇 초)를 입력받아 몇 시간 몇 분 몇 초인지 출력
//1817022 조이린

import java.util.Scanner;
public class ArithmeticOperator {
	public static void main(String[] args) {
		int time, second, minute, hour;
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");	//시, 분, 초로 변환될 정수 입력
		
		time = sc.nextInt();
		second = time % 60; //초
		minute = (time / 60) % 60; //분
		hour = (time / 60) / 60;  //시간
		
		System.out.print(time + "초는 ");
		System.out.print(hour + "시간, ");
		System.out.print(minute+ "분, ");
		System.out.println(second + "초입니다.");
		
		sc.close();
	}
}