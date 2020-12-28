package ex7;

//(예제7) 양의 정수를 입력받아 개수와 합을 출력하는 프로그램. 0이 입력되면 종료하고 입력된 수의 개수와 합을 출력
//1817022 조이린

import java.util.Scanner;
public class CountAndSum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = 0, sum = 0;
		int num;
		while(true) {
			num = in.nextInt();
			if(num == 0) break;
			else {
				count++;
				sum += num;
			}
		}
		
		
		/*for (;;) {
			num = in.nextInt();
			if(num == 0) break;
			else {
				count++;
				sum += num;
			}
		}
		*/
		
		System.out.println("count = " + count);
		System.out.println("sum = " + sum);
		
		in.close();
	}
}