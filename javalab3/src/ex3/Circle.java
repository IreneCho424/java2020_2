package ex3;

//(예제3) 원의 면적, 원주 구하는 클래스 - static의 사용
//1817022 조이린

public class Circle{
	
	public static final double PI = 3.14159;
	
	//public double radius; 	//instance variable --> static 메소드에서 사용 불가능!
	
	public static double area(double radius) {
		return(PI*radius*radius);
	}
	
	public static double circum(double radius) {
		return(PI*(radius+radius));
	}
}
