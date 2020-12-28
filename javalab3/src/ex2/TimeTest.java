package ex2;
import java.util.Scanner;

//(예제2) 객체 배열 예제  -time class 선언
//1817022 조이린


class Time{
	int hour;
	int minute;
	int second;
}

public class TimeTest{
	
	public static void main(String[] args) {
		Scanner kbd = new Scanner(System.in);
		System.out.println("How many times do you want to generate?");
		int n = kbd.nextInt();
		Time[] t = new Time[n];
		
		int i;
		for(i=0;i<t.length;i++) {
			t[i] = new Time();
			t[i].hour = randNum(24);
			t[i].minute = randNum(60);
			t[i].second = randNum(60);
		}
		
		for(i=0;i<t.length;i++) {
			System.out.println("<Time"+(i+1)+"> Hour:" +t[i].hour + "\tMin:" + t[i].minute + "\tSec:"+t[i].second);
		}
		
		kbd.close();
	}
	
	public static int randNum(int n) {
		return (int)(Math.random()*n);		//Math 클래스 이용하여 랜덤숫자 뽑기
	}
}