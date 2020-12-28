package pm5;

//(실습5) 폰 판매량 구하기2
//1817022 조이린

import java.util.Scanner;
public class Sell2 {
	public static void main(String[] args) {
		int phone[] = {0, 0, 0, 0, 0};
		System.out.println("판매한 폰 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = 0;
		while(true) {
			String what = sc.next();
			switch(what) {
			case "갤럭시" : 
				num = sc.nextInt();
				phone[0] += num;
				continue;
			case "베가" : 
				num = sc.nextInt();
				phone[1] += num;
				continue;
			case "옵티머스" : 
				num = sc.nextInt();
				phone[2] += num;
				continue;
			case "루미나" : 
				num = sc.nextInt();
				phone[3] += num;
				continue;
			case "아이폰" : 
				num = sc.nextInt();
				phone[4] += num;
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