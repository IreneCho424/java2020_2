package pm2;

//(실습2) Printer 클래스를 상속받은 InkjetPrinter 클래스
//1817022 조이린

public class InkjetPrinter extends Printer{
	
	protected int leftInk = 20;
	
	public InkjetPrinter(String modelName, String maker, String interf, int printP) {
		super(modelName, maker, interf, printP);
	}
	
	public void fillInk(int newInk) {		//잉크가 부족할 경우 잉크 채우는 함수
		leftInk += newInk;
	}
	
	public void print(int count) {			//출력하는 함수
		leftInk -= 10;						//인쇄 할때마다 10씩 잉크 소비됨
		System.out.println("잉크젯 프린터 출력");
		System.out.println("잉크젯 프린터>> 인쇄용지:" + printPaper + "출력매수:" + count + "잉크잔량:" + leftInk);		//출력매수 어캄
		
	}
}