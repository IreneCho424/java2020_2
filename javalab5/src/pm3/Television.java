package pm3;

//(실습3) Product 클래스를 상속받은 Television 클래스
//1817022 조이린

public class Television extends Product{
	int inchSize;		//화면 사이즈
	
	public Television(int inchSize) {		//Product가 추상 클래스이기 때문에 Product()의 기본 생성자가 존재해야 한다. 
		this.inchSize = inchSize;
	}
	
	public Television(Brand company, String name, int price, int inchSize) {
		super(company, name, price);
		this.inchSize = inchSize;
	}
	
	@Override
	public void displayProductInfo() {
		System.out.println("TV size : " + inchSize + " | 제조사 : " + company.getValue() + 
				" | 제품명 : " + name + " | 가격 : " + price);
	}
}