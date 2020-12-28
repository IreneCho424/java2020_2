package pm3;
import java.util.Scanner;

//(실습3) 주사위 게임 프로그램
//1817022 조이린

public class Tester{
	public static void main(String[] args) throws Exception {
		System.out.println("****************************");
		System.out.println("Major: Computer Engineering");
		System.out.println("ID: 1817022");
		System.out.println("Name: 조이린");
		System.out.println("****************************");
		
		Scanner sc = new Scanner(System.in);	//사용자의 입력을 받기 위해 Scanner 클래스 객체 생성
		
		Dice dice = new Dice();		//주사위 생성
		Person p1 = new Person('1', sc);	//플레이어 1 생성
		Person p2 = new Person('2', sc);	//플레이어 2 생성
		
		char choice = 'y';	//사용자가 게임을 계속 진행할 것인지에 대한 의사를 입력받을 변수 choice. 처음엔 'y'로 초기화하여 게임을 시작할 수 있게 함
		
		while(choice == 'y') {
			dice.setDiceNum();	//주사위를 굴려 눈의 값을 생성하고
			p1.inputGuessNum(); //플레이어 1이 주사위의 눈을 추측
			System.out.println(p1.getGuessNum());
			p2.inputGuessNum(); //플레이어 2이 주사위의 눈을 추측
			System.out.println("Dice number: " + dice.getDiceNum());	//주사위 눈의 값
			
			int baseNum = dice.getDiceNum();
			int p1Num = p1.getGuessNum();
			int p2Num = p2.getGuessNum();
			
			//p1의 추측이 p2의 추측보다 실제 값과의 차이가 크다면
			if(diff(baseNum, p1Num) > diff(baseNum, p2Num))
				System.out.println("Person2 won!");	//p2가 이김
			//p2의 추측이 p1의 추측보다 실제 값과의 차이가 크다면
			else if(diff(baseNum, p1Num) < diff(baseNum, p2Num))
				System.out.println("Person1 won!");	//p1가 이김
			else { //p1의 추측과 p2의 추측의 실제값으로부터의 차가 서로 같다면
				System.out.println("tie.");	//비김
			}
			
			System.out.println("Repeat?(y/n)");	//게임을 계속 할건지에 대한 메세지
			choice = sc.next().charAt(0);
		}
		
		sc.close();
	}
	
	public static int diff(int a, int b) {	//두 정수값의 차를 계산해주는 static method
		return a > b ? a-b : b-a;		//a가 b보다 크다면 a-b를, 그렇지 않다면 b-a를 반환한다.
	}
}