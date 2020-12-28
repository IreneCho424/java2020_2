package ex3;

//(예제3) 인터페이스 예제
//1817022 조이린

public class WodkTest{
	
	public static void main(String[] args) {
		
		//호텔주방장 hcook, 아르바이트 pcook, 점원은 bk
		BuggerCook hcook = new HotelCook();
		BuggerCook pcook = new PartTimeCook();
		BuggerClerk bk = new BuggerClerk();
		
		//주문발생에 대한 처리
		System.out.println("호텔식 햄버거 주문요청 들어옴");
		bk.orderBurger(hcook);
		
		System.out.println("호텔식 햄버거 주문요청 들어옴");
		bk.orderBurger(hcook);
		
		System.out.println("알바식 샐러드 주문요청 들어옴");
		bk.orderSalad(pcook);
		
		System.out.println("알바식 햄버거 주문요청 들어옴");
		bk.orderBurger(pcook);
		
		System.out.println("호텔식 샐러드 주문요청 들어옴");
		bk.orderSalad(hcook);
	}
}