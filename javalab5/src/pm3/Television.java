package pm3;

//(�ǽ�3) Product Ŭ������ ��ӹ��� Television Ŭ����
//1817022 ���̸�

public class Television extends Product{
	int inchSize;		//ȭ�� ������
	
	public Television(int inchSize) {		//Product�� �߻� Ŭ�����̱� ������ Product()�� �⺻ �����ڰ� �����ؾ� �Ѵ�. 
		this.inchSize = inchSize;
	}
	
	public Television(Brand company, String name, int price, int inchSize) {
		super(company, name, price);
		this.inchSize = inchSize;
	}
	
	@Override
	public void displayProductInfo() {
		System.out.println("TV size : " + inchSize + " | ������ : " + company.getValue() + 
				" | ��ǰ�� : " + name + " | ���� : " + price);
	}
}