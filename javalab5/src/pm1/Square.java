package pm1;

//(�ǽ�1) Geometry �������̽� �����ϴ� Square class
//1817022 ���̸�

public class Square implements Geometry{
	
	private double side;				//�簢���� �� ���� ���� 
	
	public Square() {}
	public Square(double side) {
		this.side = side;
	}
	
	public double area() {				//������ ���ϴ� ������ �������̵��Ͽ� ����
		return side*side;
	}
	
	public double perimeter() {			//�ѷ��� ���ϴ� ������ ����
		return side*4;
	}
	
}