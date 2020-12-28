package pm3;

//(실습3) 인터페이스 및 열거타입 활용 프로그램
//1817022 조이린

public class InterfaceExam{
	
	public static void main(String[] args) {
		
		Television tv = new Television(Brand.SAMSUNG, "파브", 2500000, 48);
		Computer computer = new Computer(Brand.SAMSUNG, "시리즈 9", 1800000, 500, 16);
		
		ProductInter[] p = new ProductInter[2];			//ProductInter 타입 배열 생성
		p[0] = tv;
		p[1] = computer;
		
		for(int i = 0; i < p.length; i++) {				//객체별로 각각의 displayProductInfo() 함수 호출됨
			p[i].displayProductInfo();
		}
	}
}