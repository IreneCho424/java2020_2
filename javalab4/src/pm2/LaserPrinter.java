package pm2;

//(실습2) Printer 클래스를 상속받은 LaserPrinter 클래스
//1817022 조이린

public class LaserPrinter extends Printer{

	protected int leftToner = 20;				//주어진 초기 정보
	
	public LaserPrinter(String modelName, String maker, String interf, int printP) {
		super(modelName, maker, interf, printP);
	}
	
	public void fillToner(int newToner) {		//토너 양이 부족할 경우 추가하는 함수
		leftToner += newToner;
	}
	
	public void print(int count) {				//출력하는 함수
		leftToner -= 5;							//인쇄 할때마다 5씩 토너 소비됨
		System.out.println("레이저 프린터 출력");
		System.out.println("레이저 프린터>> 인쇄용지:" + printPaper + "출력매수:" + count + "토너잔량:" + leftToner);		//출력매수 어캄
		
	}
}