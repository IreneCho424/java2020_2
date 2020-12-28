package ex4;

//(예제4) 인터페이스 예제- 인터페이스 구현한 Rectangle class
//1817022 조이린

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