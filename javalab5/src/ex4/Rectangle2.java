package ex4;

//(����4) �������̽� ����- �������̽� ������ Rectangle2(���簢��) class
//1817022 ���̸�

public class Rectangle2 implements ShapesInterface{
	int width, height;
	double area;
	public Rectangle2(int w) {
		width = w;
		height = w;
	}
	
	public void computeArea() {
		area = width * height;
	}
	
	public void show() {
		System.out.print("Rectangle2 : ");
		System.out.println(width + " " + height + " " + area);
	}
}