package pm3;

//(실습3) 숫자 저장과 합계 계산
//1817022 조이린

import java.util.Scanner;
public class SaveAndSum{
	public static void main(String[] args) {
		int A[] = new int[5];
		System.out.println("숫자 5개 입력: ");
		Scanner sc = new Scanner(System.in);
		int sum = 0;	//sum 값 초기화
		int max = 0;	//max 값 초기화
		for(int i=0;i<5;i++) {
			A[i] = sc.nextInt();	//배열에 입력받은 값 저장
			if(A[i] > max) max = A[i];	//크기 비교 - 최대값 찾기
			sum += A[i];			//합계 구하기
		}
		System.out.println("최대값 : " + max);
		System.out.println("합계 : " + sum);
		
		sc.close();
	}
}