package ex1;

//(���� 1) TwoDShape�� ��ӹ޴� Triangle Ŭ����. �ﰢ���� ������ �˷��ִ� style ���� �� �Լ� �߰�. area() �Լ� �������̵� 
//1817022 ���̸�

public class Triangle extends TwoDShape{
	public String style;
	
	public double area() {				//�ﰢ���� ���� ����
		return width * height / 2;
	}
	
	public void showStyle() {			//�ﰢ���� ���� ��Ÿ���� �Լ�
		System.out.println("Triangle is " + style);
	}
}