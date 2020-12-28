package pm3;
import java.util.Scanner;

//(실습3) 주사위 게임에 사용될 Person 클래스
//1817022 조이린

public class Person{
	Scanner kbd;
	
	private int guessNum;	//플레이어가 추측한 눈의 값을 저장할 int형 변수 선언
	private char ID;		//플레이어의 ID를 저장할 char형 변수 선언
	
	Person(char ID, Scanner sc){
		this.ID = ID;	//char형 변수를 인자로 받아 ID에 저장하는 생성자
		kbd = sc;
	}
	
	public int getGuessNum() {
		return guessNum;	//guessNum을 반환해주는 메소드
	}
	
	public void inputGuessNum() throws GuessNumException {
		int flag = 0;		//예외 처리 여러번 할 수 있도록 표시하는 변수
		while(flag == 0) {
			try {
				System.out.println("Person " + this.ID + " - Guess the number:");
				int guessNum = kbd.nextInt();
				System.out.println("여기서 guessNum : " + guessNum);
				if(guessNum < 1 || guessNum > 6) {
					throw new GuessNumException();
				}
				else {
					this.guessNum = guessNum;
					flag = 1;
				}
			}
			catch(GuessNumException e) {
				System.out.println(e.getMessage());
				//kbd = new Scanner(System.in);
				flag = 0;
			}
		}
	}
}