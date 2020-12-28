package ex5;
import java.util.Scanner;

//(����5) ����Ÿ��(enum) Currency2 ���� �� Ȱ�� ����
//1817022 ���̸�

enum Currency2{		//double Ÿ���� ���� ��Ī ����
	DOLLAR(1194.90), EURO(1312.48), YEN(11.11), YUAN(167.96);
	private double value;
	
	private Currency2(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
}

public class EnumDemo2{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ȭ�� ���ϼ���(1.�޷�, 2.����, 3.��, 4.����) >>");
		int choice = scan.nextInt();
		
		Currency2 cur;
		if(choice == 1) cur = Currency2.DOLLAR;
		else if(choice == 2) cur = Currency2.EURO;
		else if(choice == 3) cur = Currency2.YEN;
		else cur = Currency2.YUAN;
		
		switch(cur) {		//Currency2�� Ÿ�Կ� ���� �ٸ� �� ȣ��
		case DOLLAR:
			System.out.println("�޷� ȯ�� : " + cur.getValue() + "��"); break;
		case EURO:
			System.out.println("���� ȯ�� : " + cur.getValue() + "��"); break;
		case YEN:
			System.out.println("�� ȯ�� : " + cur.getValue() + "��"); break;
		case YUAN:
			System.out.println("���� ȯ�� : " + cur.getValue() + "��"); break;
		}
		
		scan.close();
	}
}