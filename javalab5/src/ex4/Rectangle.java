package ex4;

//(����4) �������̽� ����- �������̽� ������ Rectangle class
//1817022 ���̸�

public class Rectangle implements ShapesInterface{
	int width, height;
	double area;
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public void computeArea() {
		area = width * height;
	}
	
	public void show() {
		System.out.print("Rectangle : ");
		System.out.println(width + " " + height + " " + area);
	}
}