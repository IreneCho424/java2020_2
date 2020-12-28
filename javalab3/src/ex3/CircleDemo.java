package ex3;
import java.util.Scanner;

//(예제3) 반지름을 입력받은 후 원의 면적, 원주 구하는 프로그램
//1817022 조이린

public class CircleDemo{
	
	public static void main(String[] args) {
		double r;
		Scanner sc = new Scanner(System.in);
		r = sc.nextDouble();
		
		System.out.println("area:" + Circle.area(r));	//calling static method
		System.out.println("Circumference:" + Circle.circum(r));	//calling static method
		
		sc.close();
	}
}