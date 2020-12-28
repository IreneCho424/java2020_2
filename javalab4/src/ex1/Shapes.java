package ex1;
import java.util.Scanner;

//(���� 1) TwoDShape Ŭ������ �̿��ϴ� ����. 
//1817022 ���̸�

public class Shapes{
	public static void main(String[] args) {
		//Triangle ��� ����
		Triangle t1 = new Triangle();
		Triangle t2 = new Triangle();
		t1.width = 4.0;				//Triangle Ŭ������ TwoDShape Ŭ������ ��ӹ޾����Ƿ� �ٷ� �̿� ����. 
		t1.height = 4.0;
		t1.style = "isosceles";
		
		t2.width = 8.0;
		t2.height = 12.0;
		t2.style = "right";
		
		System.out.println("Info for t1:");
		t1.showStyle();
		t1.showDim();
		System.out.println("Area is " + t1.area());
		System.out.println();
		
		System.out.println("Info for t2:");
		t2.showStyle();
		t2.showDim();
		System.out.println("Area is " + t2.area());
		
		
		//Rectangle ��� ����
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.println("width >> ");
			double w = scan.nextDouble();
			System.out.println("height >> ");
			double h = scan.nextDouble();
			
			if(w<0 || h<0) break;		//������ �������� ����
			
			Rectangle rect = new Rectangle();			//Rectangle Ŭ������ TwoDShape Ŭ������ ��ӹ޾����Ƿ� �ٷ� �̿� ����.
			rect.width = w;
			rect.height = h;
			
			rect.showDim();
			System.out.println("Area is " + rect.area());
			System.out.println("Is it square? " + rect.isSquare());
			System.out.println();
		}
		
		scan.close();
		System.out.println("\n**The End***");
		
	}
}