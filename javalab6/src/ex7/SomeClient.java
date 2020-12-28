package ex7;
import java.util.Scanner;

//(예제7) Wrapper 클래스 사용 예제 - 문자열을 입력받아 문자열을 구성하는 문자 중 수를 추출하여 모두 더하는 코드
//1817022 조이린

public class SomeClient{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str;
		str = sc.nextLine();
		
		int sum = 0;
		int i = 0;
		
		while(i<str.length()) {
			if(48 <= str.charAt(i) && str.charAt(i) <= 57)
				sum += Integer.parseInt(str.substring(i, i+1));	//index i번째에서 문자열 잘라내는 함수
			i++;
		}
		
		System.out.println("최종 합 :: " + sum);
		sc.close();
	}
}