package pm1;
import java.util.Scanner;

//(실습1) Geometry 인터페이스 사용 실습
//1817022 조이린

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

		Geometry g[] = new Geometry[3];					//인터페이스 배열 생성
		g[0] = circle;
		g[1] = square;
		g[2] = triangle;
		
		for(int i=0;i<g.length;i++) {
			if(g[i] instanceof Circle) {				//Circle클래스에 해당할 경우
				System.out.println("<Circle>");
				System.out.println("Area : " + g[i].area());
				System.out.println("Circumference : " + g[i].perimeter());
			}
			else if(g[i] instanceof Square) {			//Square클래스에 해당할 경우
				System.out.println("<Square>");
				System.out.println("Area : " + g[i].area());
				System.out.println("Circumference : " + g[i].perimeter());
			}
			else {										//그외(Triangle) 클래스에 해당할 경우
				System.out.println("<Triangle>");
				System.out.println("Area : " + g[i].area());
				System.out.println("Circumference : " + g[i].perimeter());				
			}
		}
		
		scan.close();
	}
}