package ex4;

//(����4) �������̽� ����- �������̽� ������ Triangle class
//1817022 ���̸�

public class Triangle implements ShapesInterface{
	int width, height;
	double area;
	public Triangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public void computeArea() {
		area = (width + height) / 2.0;
	}
	
	public void show() {
		System.out.print("Triangle : ");
		System.out.println(width + " " + height + " " + area);
	}
}