package pm3;

//(�ǽ�3) ���� ���� ���� ���α׷�
//1817022 ���̸�

public class AccountDemo{
	
	public static void main(String[] args) {	//������ ��ü ��� ����
		Account kim = new Account("Kim", 1000, 0.03);
		Account lee = new Account("Lee", 0.04);
		Account park = new Account("Park", 2000, 0.05);
		
		//"Kim"��ü�� ���� ��ü ���� ���
		kim.showAll();
		System.out.println();
		kim.deposit(300);
		kim.withdraw(100);
		//5��ġ ���� ��� �� balance�� ����
		kim.computeTotal(5);
		kim.showOwner();
		kim.showBalance();
		System.out.println();
		
		//"Lee"��ü�� ���� ��ü ���� ���
		lee.showAll();
		System.out.println();
		lee.deposit(300);
		lee.withdraw(100);
		//5��ġ ���� ��� �� balance�� ����
		lee.computeTotal(5);
		lee.showOwner();
		lee.showBalance();
		System.out.println();
		
		//"Park"��ü�� ���� ��ü ���� ���
		park.showAll();
		System.out.println();
		park.deposit(300);
		park.withdraw(100);
		//5��ġ ���� ��� �� balance�� ����
		park.computeTotal(5);
		park.showOwner();
		park.showBalance();
		System.out.println();
	}
}