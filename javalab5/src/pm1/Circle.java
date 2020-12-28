package pm1;

//(실습1) Geometry 인터페이스 구현하는 Circle class
//1817022 조이린

public class Circle implements Geometry{
	
	private double rad;						//원의 반지름
	
	public Circle() {}
	public Circle(double radius) {
		this.rad = radius;
	}
	
	public double area() {					//면적을 구하는 공식을 오버라이딩하여 구현
		return PI*rad*rad;
	}
	
	public double perimeter() {				//둘레를 구하는 공식을 구현
		return 2*PI*rad;
	}
}