package ex3;

//(예제 3) 인터페이스 예제
//1817022 조이린

interface BuggerCook{
	public void makeBurger();
	public void makeSalad();
}

class HotelCook implements BuggerCook{
	
	public void makeBurger() {
		System.out.println("호텔급 햄버거 요리 중");
	}
	
	public void makeSalad() {
		System.out.println("호텔급 샐러드 요리 중");
	}
}

class PartTimeCook implements BuggerCook{
	public void makeBurger() {
		System.out.println("아르바이트급 햄버거 요리 중");
	}
	
	public void makeSalad() {
		System.out.println("아르바이트급 샐러드 요리 중");
	}
}

class BuggerClerk{
	
	//고객의 요구사항 처리
	public void orderBurger(BuggerCook cook) {
		System.out.println("햄버거 주문");
		cook.makeBurger();
	}
	
	public void orderSalad(BuggerCook cook) {
		System.out.println("샐러드 주문");
		cook.makeSalad();
	}
}