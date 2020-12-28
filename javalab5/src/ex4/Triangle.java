package ex4;

//(예제4) 인터페이스 예제- 인터페이스 구현한 Triangle class
//1817022 조이린

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