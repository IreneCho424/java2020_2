package ex2;
import java.util.Scanner;

//(����2) ��ü �迭 ����  -time class ����
//1817022 ���̸�


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
		return (int)(Math.random()*n);		//Math Ŭ���� �̿��Ͽ� �������� �̱�
	}
}