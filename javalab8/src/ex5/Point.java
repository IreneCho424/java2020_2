package ex5;

//(예제5) 제너릭 클래스 예제 
//1817022 조이린

public class Point {
	int a, b;
	public Point(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String toString() {
		return "(" + a + "," + b + ")";
	}
}
