package ex4;

//(예제4) 인터페이스 예제- Triangle class 상속받은 ColorTriangle class
//1817022 조이린

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