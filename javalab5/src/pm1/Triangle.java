package pm1;

//(�ǽ�1) Geometry �������̽� �����ϴ� Triangle class
//1817022 ���̸�

public class Triangle implements Geometry{
	
	private double s1 = 0, s2 = 0, s3 = 0;		//�ﰢ���� �� ���� ���� ���� �����ϴ� ����
	
	public Triangle() {}						//�⺻ ������
	public Triangle(double a, double b, double c) {	//�ﰢ���� �� ���� ���̸� �޴� ������
		this.s1 = a;
		this.s2 = b;
		this.s3 = c;
	}
	
	public double area() {						//������ ���ϴ� ������ �������̵��Ͽ� ����
		double s = (this.s1 + this.s2 + this.s3)/ 2.0; 
		double area = Math.sqrt(s*(s-this.s1)*(s-this.s2)*(s-this.s3));
		return area;
	}
	
	public double perimeter() {					//�ѷ��� ���ϴ� ������ ����
		double peri = this.s1 + this.s2 + this.s3;
		return peri;
	}
}