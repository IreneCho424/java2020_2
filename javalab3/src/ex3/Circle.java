package ex3;

//(����3) ���� ����, ���� ���ϴ� Ŭ���� - static�� ���
//1817022 ���̸�

public class Circle{
	
	public static final double PI = 3.14159;
	
	//public double radius; 	//instance variable --> static �޼ҵ忡�� ��� �Ұ���!
	
	public static double area(double radius) {
		return(PI*radius*radius);
	}
	
	public static double circum(double radius) {
		return(PI*(radius+radius));
	}
}
