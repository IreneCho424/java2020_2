package pm2;
import java.util.Scanner;

//(실습2) 한영사전 실습 - 한국어 단어를 입력 받아 영단어로 바꾸는 프로그램
//1817022 조이린

public class DictionaryDemo{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한영 단어 검색 프로그램입니다.");
		
		
		while(true) {
			System.out.println("한글 단어?");
			String korword = sc.next();
			if(korword.contentEquals("그만")) break;
			else {
				System.out.println(korword + Dictionary.korToEngWord(korword));
			}
		}
		sc.close();
	}
}