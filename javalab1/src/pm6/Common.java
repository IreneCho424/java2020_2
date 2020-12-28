package pm6;

//(실습6) 공배수의 개수 찾기
//1817022 조이린

import java.util.Scanner;
public class Common{
	public static void main(String[] args) {
		System.out.println("두 개의 정수 입력 : ");
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int count = 0;
		for(int i = 0; i < 1000; i++) {
			if((i+1) % num1 == 0 && (i+1) % num2 == 0) {
				count += 1;
			}
		}
		sc.close();
		System.out.printf("두 수의 공배수 개수는 %d입니다.\n", count);
	}
}