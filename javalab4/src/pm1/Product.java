package pm1;

//(�ǽ�1) ��ǰ�� ������ �Է� �޾� �����ϴ� Product Ŭ����
//1817022 ���̸�

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
	
	//productID�� ���� getter, setter
	public int getID() {
		return productID;
	}
	public void setID(int ID) {
		this.productID = ID;
	}
	//description�� ���� getter, setter
	public String getDescription() {
		return description;
	}
	public void setDes(String des) {
		this.description = des;
	}
	//maker�� ���� getter, setter
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	//price�� ���� getter, setter
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {		//��� ���� ���
		System.out.println("��ǰID>> " + productID);
		System.out.println("��ǰ ���� >> " + description);
		System.out.println("������ >> " + maker);
		System.out.println("��ǰ ���� >> " + price);
	}
}