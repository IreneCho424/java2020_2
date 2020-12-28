package pm3;

//(실습3) ProductInter 인터페이스, 인터페이스를 구현한 추상클래스 Product
//1817022 조이린

interface ProductInter{
	void displayProductInfo();
}

abstract class Product implements ProductInter{		//왜 abstract? -->제품의 종류에 따라 서브 클래스를 달리 만들고, Product 클래스 자체의 객체를 만들지 못하게 하기 위해서 abstract class로 설정
	Brand company;		//제품 제조사
	String name;		//제품명
	int price;			//제품 가격
	
	public Product() {}				//Television 클래스에서 오버라이딩한 생성자 말고 다른 생성자를 추가하기 위해서 기본 생성자가 필요함		
	
	public Product(Brand company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}
}