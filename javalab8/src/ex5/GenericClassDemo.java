package ex5;

import ex4.MyClass;

//(예제5) 제너릭 클래스 예제
//1817022 조이린

public class GenericClassDemo {

	public static void main(String[] args) {
		MyClass<Point> p = new MyClass<Point>();
		Point point = new Point(1,2);
		p.set(point);
		System.out.println(p.get().toString());
	}

}
