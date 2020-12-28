package pm1;
import java.util.Scanner;

//(�ǽ�1) Geometry �������̽� ��� �ǽ�
//1817022 ���̸�

public class GeometryDemo{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Input radius for a circle");
		double radius = scan.nextDouble();
		Circle circle = new Circle(radius);
		System.out.println("Input length for a square");
		double length = scan.nextDouble();
		Square square = new Square(length);
		System.out.println("Input a for a triangle");
		double s1 = scan.nextDouble();
		System.out.println("Input b for a triangle");
		double s2 = scan.nextDouble();
		System.out.println("Input c for a triangle");
		double s3 = scan.nextDouble();
		Triangle triangle = new Triangle(s1, s2, s3);

		Geometry g[] = new Geometry[3];					//�������̽� �迭 ����
		g[0] = circle;
		g[1] = square;
		g[2] = triangle;
		
		for(int i=0;i<g.length;i++) {
			if(g[i] instanceof Circle) {				//CircleŬ������ �ش��� ���
				System.out.println("<Circle>");
				System.out.println("Area : " + g[i].area());
				System.out.println("Circumference : " + g[i].perimeter());
			}
			else if(g[i] instanceof Square) {			//SquareŬ������ �ش��� ���
				System.out.println("<Square>");
				System.out.println("Area : " + g[i].area());
				System.out.println("Circumference : " + g[i].perimeter());
			}
			else {										//�׿�(Triangle) Ŭ������ �ش��� ���
				System.out.println("<Triangle>");
				System.out.println("Area : " + g[i].area());
				System.out.println("Circumference : " + g[i].perimeter());				
			}
		}
		
		scan.close();
	}
}