package pm4;
import java.util.Scanner;

//(�ǽ�4) ��Ģ���� ���α׷�
//1817022 ���̸�

public class CalcTest{
	public static void main(String[] args) {
		System.out.println("�� ������ �����ڸ� �Է��ϼ���>> ");			//������ ������ �Է� �޾� ��Ģ����
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		String m = scanner.next();
		
		if(m.equals("+")) {										//���� ���� ��ü ����
			Add add = new Add();
			add.setValue(a, b);
			int result = add.add();
			System.out.println(result);
		}
		else if(m.equals("-")) {								//�y�� ���� ��ü ����
			Sub sub = new Sub();
			sub.setValue(a, b);
			int result = sub.sub();
			System.out.println(result);
		}
		else if(m.equals("*")) {								//���� ���� ��ü ����
			Mul mul = new Mul();
			mul.setValue(a, b);
			int result = mul.mul();
			System.out.println(result);
		}
		else if(m.equals("/")) {								//������ ���� ��ü ����
			Div div = new Div();
			div.setValue(a, b); 
			int result = div.div();
			System.out.println(result);
		}
		else {
			System.out.println("�߸��� �������Դϴ�.");
		}
		
		scanner.close();
	}
}