package ex5;

//(예제5) 열거타입(enum) Currency 정의 및 활용 예제
//1817022 조이린

enum Currency{
	DOLLAR, EURO, YEN, YUAN;
}

public class EnumDemo1{
	
	public static void main(String[] args) {
		for(Currency c : Currency.values()) {
			System.out.println(c.ordinal()+ " " + c.toString());
		}
	}
}