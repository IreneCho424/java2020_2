package pm1;
import java.util.InputMismatchException;
import java.util.Scanner;

//(실습1) 게임 캐릭터 만들기 프로그램
//1817022 조이린

public class Game{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Character c = null;
		
		int a = 0;			//두 개의 while 문을 따져가며 돌기 위한 매개체
		
		while(a == 0) {
			try {
				System.out.println("캐릭터를 선택하세요.");
				System.out.println("1.성직자   2.궁수   3.마법사   4.기사"); 
				int choice = sc.nextInt(); //숫자를 입력하지 않을 경우 exception 발생
				if(choice > 4) {
					System.out.println("1번부터 4번 중에서 선택하세요");
					continue;
				}
				switch(choice) {	//각각의 캐릭터에 대한 객체 생성 및 능력 출력
				case(1):
					c = new Monk();
					c.setCharName("Monk");
					break;
				case(2):
					c = new Archer();
					c.setCharName("Archer");
					break;
				case(3):
					c = new Wizard();
					c.setCharName("Wizard");
					break;
				case(4):
					c = new Knight();
					c.setCharName("Knight");
					break;
				}
				
				if(0<choice && choice < 5) {
					c.characterSkill();
					c.appendCharacter();
				}
				
				while(true) {
					System.out.println("캐릭터를 변경하겠습니까?");
					String ans = sc.next();
					
					if(ans.contentEquals("Y") || ans.contentEquals("y"))
						break;		//a가 0인 상태에서 두번째 while문을 나오게 됨
					else if(ans.contains("N") || ans.contentEquals("n")) {
						System.out.println("게임을 종료했습니다.");
						a=1;
						break;		//두번째 while문 종료 및 a가 1이므로 첫번쨰 while문도 해당없음. 프로그램 종료
					}
					else {
						System.out.println("y/n 중에 입력하세요");		//두번째 while문으로 돌아감
					}
				}
			}
			catch(InputMismatchException e){
				sc = new Scanner(System.in);
				System.out.println("숫자를 입력하세요!");
			}
		}
		
		sc.close();
	}
}
