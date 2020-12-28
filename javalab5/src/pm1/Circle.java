package pm1;

//(�ǽ�1) Geometry �������̽� �����ϴ� Circle class
//1817022 ���̸�

public class Circle implements Geometry{
	
	private double rad;						//���� ������
	
	public Circle() {}
	public Circle(double radius) {
		this.rad = radius;
	}
	
	public double area() {					//������ ���ϴ� ������ �������̵��Ͽ� ����
		return PI*rad*rad;
	}
	
	public double perimeter() {				//�ѷ��� ���ϴ� ������ ����
		return 2*PI*rad;
	}
}