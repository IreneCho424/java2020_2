package pm3;

//(실습3) 주사위 정보를 저장하는 클래스
//1817022 조이린

public class Dice{
	private int diceNum; 	//주사위의 눈을 저장할 int형 변수 diceNum 선언
	
	public void setDiceNum() {	//diceNum에 값을 설정하는 메소드
		System.out.println("\nDice is rolled.");//주사위의 눈이 정해질 떄마다 메세지 출력
		diceNum = (int)(Math.random() * 6) + 1;	//1~6 사이의 임의의 수를 만들어 diceNum에 저장
	}
	
	public int getDiceNum() {
		return diceNum;			//diceNum의 값을 반환해주는 메소드
	}
}