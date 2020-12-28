package ex4;

//(예제4) 인터페이스 예제- 인터페이스 구현한 Rectangle2(정사각형) class
//1817022 조이린

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