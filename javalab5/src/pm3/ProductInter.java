package pm3;

//(�ǽ�3) ProductInter �������̽�, �������̽��� ������ �߻�Ŭ���� Product
//1817022 ���̸�

interface ProductInter{
	void displayProductInfo();
}

abstract class Product implements ProductInter{		//�� abstract? -->��ǰ�� ������ ���� ���� Ŭ������ �޸� �����, Product Ŭ���� ��ü�� ��ü�� ������ ���ϰ� �ϱ� ���ؼ� abstract class�� ����
	Brand company;		//��ǰ ������
	String name;		//��ǰ��
	int price;			//��ǰ ����
	
	public Product() {}				//Television Ŭ�������� �������̵��� ������ ���� �ٸ� �����ڸ� �߰��ϱ� ���ؼ� �⺻ �����ڰ� �ʿ���		
	
	public Product(Brand company, String name, int price) {
		this.company = company;
		this.name = name;
		this.price = price;
	}
}