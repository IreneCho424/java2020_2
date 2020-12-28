package pm3;
import java.util.Scanner;

//(실습3) String 라이브러리 활용 실습 _ 입력 받은 두 문자열이 재배열시 서로가 될 수 있는지 확인
//1817022 조이린

public class StringDemo{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two words>> ");
		
		String st1 = scan.next();
		String st2 = scan.next();
		st1 = st1.toLowerCase();				//문자별 비교 간단히 하기 위해서 모두 소문자로 변경
		st2 = st2.toLowerCase();
		
		int check = -1;							//결과 비교 위한 체크변수
		
		if(st1.length() != st2.length()) {		//길이가 다르면 비교할 필요 없으므로 F
			System.out.println("F");
		}
		else {									//길이가 같으면 서로 비교
			for(int i=0;i<st1.length();i++) {
				char s1 = st1.charAt(i);
				for(int j=0;j<st2.length();j++) {
					char s2 = st2.charAt(j);
					if(s1 == s2) {				//s1에 있는 문자가 s2에도 있는지 확인
						check++;
					}
				}
			}
			if(check == st1.length()-1) {		//두 문자열 모두에 있는 문자의 개수가 문자열의 길이만큼 있을 경우 T (check는 -1에서 시작했으므로 st1.length()-1)
				System.out.println("T");
			}
		}
		
		scan.close();
	}
}