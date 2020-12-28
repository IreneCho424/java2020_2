package pm1;

//(실습1) Geometry 인터페이스 구현하는 Triangle class
//1817022 조이린

public class Triangle implements Geometry{
	
	private double s1 = 0, s2 = 0, s3 = 0;		//삼각형의 세 변의 값을 각각 저장하는 변수
	
	public Triangle() {}						//기본 생성자
	public Triangle(double a, double b, double c) {	//삼각형의 세 변의 길이를 받는 생성자
		this.s1 = a;
		this.s2 = b;
		this.s3 = c;
	}
	
	public double area() {						//면적을 구하는 공식을 오버라이딩하여 구현
		double s = (this.s1 + this.s2 + this.s3)/ 2.0; 
		double area = Math.sqrt(s*(s-this.s1)*(s-this.s2)*(s-this.s3));
		return area;
	}
	
	public double perimeter() {					//둘레를 구하는 공식을 구현
		double peri = this.s1 + this.s2 + this.s3;
		return peri;
	}
}