package ex4;

//(����4) �������̽� ����- Triangle class ��ӹ��� ColorTriangle class
//1817022 ���̸�

public class ColorTriangle extends Triangle{
	String color;
	public ColorTriangle(int w, int h, String c) {
		super(w, h);
		color = c;
	}
	
	public void show() {
		System.out.print("ColorTriangle : ");
		System.out.println(width + " " + height + " " + area + " " + color);
	}
}