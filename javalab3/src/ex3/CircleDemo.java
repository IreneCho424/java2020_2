package ex3;
import java.util.Scanner;

//(����3) �������� �Է¹��� �� ���� ����, ���� ���ϴ� ���α׷�
//1817022 ���̸�

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