package ex1;

//(���� 1) TwoDShape�� ��ӹ޴� Rectangle Ŭ����. width�� height�� ���� ��� ���簢������ �Ǵ��ϴ� �Լ� �߰�, area() �Լ� �������̵� 
// 1817022 ���̸�

public class Rectangle extends TwoDShape{
	public boolean isSquare() {		//���簢������ ���� Ȯ��
		if(width == height) return true;
		else return false;
	}
	
	public double area() {			//���簢���� ���� ���ϴ� ����
		return width * height;
	}
}