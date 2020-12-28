package pm1;

//(실습1) Geometry 인터페이스 구현하는 Square class
//1817022 조이린

public class Square implements Geometry{
	
	private double side;				//사각형의 한 변의 길이 
	
	public Square() {}
	public Square(double side) {
		this.side = side;
	}
	
	public double area() {				//면적을 구하는 공식을 오버라이딩하여 구현
		return side*side;
	}
	
	public double perimeter() {			//둘레를 구하는 공식을 구현
		return side*4;
	}
	
}