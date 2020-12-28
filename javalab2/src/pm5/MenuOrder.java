package pm5;

//(실습5) 음료수 자판기 클래스
//1817022 조이린

public class MenuOrder{				//음료의 가격 받아서 설정. getter와 setter 사용
	private int cokePrice;
	private int lemonPrice;
	private int coffeePrice;
	
	public int getCokePrice() {
		return cokePrice;
	}
	public void setCokePrice(int m) {
		this.cokePrice = m;
	}
	public int getLemonPrice() {
		return lemonPrice;
	}
	public void setLemonPrice(int m) {
		this.lemonPrice = m;
	}
	public int getCoffeePrice() {
		return coffeePrice;
	}
	public void setCoffeePrice(int m) {
		this.coffeePrice = m;
	}
	
	public void showMenu() {		//메뉴 보여주기
		System.out.println("--- Select Drink ---");
		System.out.println("0: Coke. " + this.cokePrice);
		System.out.println("1: Lemonade. " + this.lemonPrice);
		System.out.println("2: Coffee. " + this.coffeePrice);
	}
	public int drinkCost(int menu, int inmoney) {		//받은 돈과 선택한 메뉴를 비교하기
		switch(menu) {
		case 0:
			inmoney -= this.cokePrice;
			break;
		case 1:
			inmoney -= this.lemonPrice;
			break;
		case 2:
			inmoney -= this.coffeePrice;
			break;
		}
		return inmoney;
	}
	public void showResult(int menu, int inmoney) {		//음료 선택 후 결과 보여주기.
		int change = this.drinkCost(menu, inmoney);
		if(menu == 0) {
			System.out.println("You selected Coke.\nYour change is " + change);
		}
		else if(menu == 1) {
			System.out.println("You selected Lemonade.\nYour change is " + change);
		}
		else if(menu == 2) {
			System.out.println("You selected Coffee.\nYour change is " + change);
		}
	}
}