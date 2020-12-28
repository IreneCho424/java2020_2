package ex5;
import java.util.Scanner;

//(����5) ����Ÿ��(enum) Currency3 ���� �� Ȱ�� ����
//1817022 ���̸�

enum Currency3{		//�� ��Ī���� �Լ� ����
	DOLLAR(1194.90){
		public void showCurrency() {
			System.out.println("�޷� ȯ��: " + getValue() + "��");
		}
	},
	EURO(1312.48){
		public void showCurrency() {
			System.out.println("���� ȯ��: " + getValue() + "��");
		}
	},
	YEN(11.11){
		public void showCurrency() {
			System.out.println("�� ȯ��: " + getValue() + "��");
		}
	},
	YUAN(167.96){
		public void showCurrency() {
			System.out.println("���� ȯ��: " + getValue() + "��");
		}
	};
	
	private double value;	
	
	private Currency3(double value) {
		this.value = value;
	}
	
	public double getValue() {
		return value;
	}
	
	public abstract void showCurrency();
}

public class EnumDemo3{
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��ȭ�� ���ϼ���(1.�޷�, 2.����, 3.��, 4.����) >> ");
		int choice = scan.nextInt();
		
		Currency3 cur;
		if(choice == 1) cur = Currency3.DOLLAR;
		else if(choice == 2) cur = Currency3.EURO;
		else if(choice == 3) cur = Currency3.YEN;
		else cur = Currency3.YUAN;
		
		cur.showCurrency();		//������ �Լ��� ȣ��
		scan.close();
	}
}