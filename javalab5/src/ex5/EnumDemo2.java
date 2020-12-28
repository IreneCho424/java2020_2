package ex5;
import java.util.Scanner;

//(예제5) 열거타입(enum) Currency2 정의 및 활용 예제
//1817022 조이린

enum Currency2{		//double 타입의 값과 명칭 연결
	DOLLAR(1194.90), EURO(1312.48), YEN(11.11), YUAN(167.96);
	private double value;
	
	private Currency2(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
}

public class EnumDemo2{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("통화를 택하세요(1.달러, 2.유로, 3.엔, 4.위안) >>");
		int choice = scan.nextInt();
		
		Currency2 cur;
		if(choice == 1) cur = Currency2.DOLLAR;
		else if(choice == 2) cur = Currency2.EURO;
		else if(choice == 3) cur = Currency2.YEN;
		else cur = Currency2.YUAN;
		
		switch(cur) {		//Currency2의 타입에 따라 다른 값 호출
		case DOLLAR:
			System.out.println("달러 환율 : " + cur.getValue() + "원"); break;
		case EURO:
			System.out.println("유로 환율 : " + cur.getValue() + "원"); break;
		case YEN:
			System.out.println("엔 환율 : " + cur.getValue() + "원"); break;
		case YUAN:
			System.out.println("위안 환율 : " + cur.getValue() + "원"); break;
		}
		
		scan.close();
	}
}