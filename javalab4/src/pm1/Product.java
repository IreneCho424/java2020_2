package pm1;

//(실습1) 상품의 정보를 입력 받아 저장하는 Product 클래스
//1817022 조이린

public class Product{
	private int productID;
	private String description;
	private String maker;
	private int price;
	
	public Product(int ID, String des, String maker, int price) {
		this.productID = ID;
		this.description = des;
		this.maker = maker;
		this.price = price;
	}
	
	//productID에 대한 getter, setter
	public int getID() {
		return productID;
	}
	public void setID(int ID) {
		this.productID = ID;
	}
	//description에 대한 getter, setter
	public String getDescription() {
		return description;
	}
	public void setDes(String des) {
		this.description = des;
	}
	//maker에 대한 getter, setter
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	//price에 대한 getter, setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {		//모든 정보 출력
		System.out.println("상품ID>> " + productID);
		System.out.println("상품 설명 >> " + description);
		System.out.println("생산자 >> " + maker);
		System.out.println("상품 가격 >> " + price);
	}
}