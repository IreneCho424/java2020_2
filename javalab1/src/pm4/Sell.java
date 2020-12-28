package pm4;

//(실습4) 폰 판매량 구하기1
//1817022 조이린

import java.util.Scanner;
public class Sell {
	public static void main(String[] args) {
		int phone[] = {0, 0, 0, 0, 0};
		System.out.println("판매한 폰 종류 입력 : ");
		Scanner sc = new Scanner(System.in);
		while(true) {
			String what = sc.next();
			switch(what) {
			case "갤럭시" : 
				phone[0] += 1;
				continue;
			case "베가" : 
				phone[1] += 1;
				continue;
			case "옵티머스" : 
				phone[2] += 1;
				continue;
			case "루미나" : 
				phone[3] += 1;
				continue;
			case "아이폰" : 
				phone[4] += 1;
				continue;
			case "끝" :
				sc.close();
				break;
			}
			break;
		}
		for(int i=0;i<5;i++) {
			System.out.printf("%d\n",phone[i]);
		}
	}
}