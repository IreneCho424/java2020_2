package pm1;
import java.util.Scanner;

//(실습1) 전화번호부 실습 - 전화번호 저장 및 찾기
//1817022 조이린

public class PhoneBook{
	
	public static void main(String[] args) {
		System.out.println("인원 수 >> ");
		Scanner sc = new Scanner(System.in);
		int pnum = sc.nextInt();
		
		Phone[] p = new Phone[pnum];
		
		for(int i=0;i<pnum;i++) {
			System.out.println("이름과 전화번호(이름과 전화번호는 공백없이 입력) >> ");
			String namei = sc.next();
			String phonei = sc.next();
			p[i] = new Phone(namei, phonei);
		}
		System.out.println("저장되었습니다.");
		
		
		while(true) {
			System.out.println("검색할 이름 >> ");
			String fname = sc.next();
			if(fname.contentEquals("그만")) break;
			else{
				for(int i=0;i<pnum;i++) {
					if(p[i].isYourName(fname) == true) {
						System.out.println(fname + " 전화번호: " + p[i].getPhoneNum());
						break;
					}
					else continue;
				}
			}
		}
		sc.close();
	}
}