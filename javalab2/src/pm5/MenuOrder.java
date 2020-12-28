package pm5;

//(�ǽ�5) ����� ���Ǳ� Ŭ����
//1817022 ���̸�

public class MenuOrder{				//������ ���� �޾Ƽ� ����. getter�� setter ���
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
	
	public void showMenu() {		//�޴� �����ֱ�
		System.out.println("--- Select Drink ---");
		System.out.println("0: Coke. " + this.cokePrice);
		System.out.println("1: Lemonade. " + this.lemonPrice);
		System.out.println("2: Coffee. " + this.coffeePrice);
	}
	public int drinkCost(int menu, int inmoney) {		//���� ���� ������ �޴��� ���ϱ�
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
	public void showResult(int menu, int inmoney) {		//���� ���� �� ��� �����ֱ�.
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