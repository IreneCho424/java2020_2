package ex5;
import java.util.Scanner;

//(예제5) 열거타입(enum) Currency3 정의 및 활용 예제
//1817022 조이린

enum Currency3{		//각 명칭마다 함수 생성
	DOLLAR(1194.90){
		public void showCurrency() {
			System.out.println("달러 환율: " + getValue() + "원");
		}
	},
	EURO(1312.48){
		public void showCurrency() {
			System.out.println("유로 환율: " + getValue() + "원");
		}
	},
	YEN(11.11){
		public void showCurrency() {
			System.out.println("엔 환율: " + getValue() + "원");
		}
	},
	YUAN(167.96){
		public void showCurrency() {
			System.out.println("위안 환율: " + getValue() + "원");
		}
	};
	
	private double value;	
	
	private Currency3(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	public abstract void showCurrency();
}

public class EnumDemo3{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("통화를 택하세요(1.달러, 2.유로, 3.엔, 4.위안) >> ");
		int choice = scan.nextInt();
		
		Currency3 cur;
		if(choice == 1) cur = Currency3.DOLLAR;
		else if(choice == 2) cur = Currency3.EURO;
		else if(choice == 3) cur = Currency3.YEN;
		else cur = Currency3.YUAN;
		
		cur.showCurrency();		//각각의 함수를 호출
		scan.close();
	}
}