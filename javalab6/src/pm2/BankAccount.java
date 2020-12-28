package pm2;

//(�ǽ�2) ����� ���� ����ó�� - ���� ���� ���α׷�
//1817022 ���̸�

public class BankAccount{
	private int money = 50000;
	
	public void withdraw(int m) {	//����
		this.money -= m;
	}
	
	public void deposit(int m) {	//�Ա�
		this.money += m;
	}
	
	public void printMoney() {		//���� �ܾ� ���
		System.out.println("�ܾ�: " + this.money + "��");
	}
	public int getMoney() {
		return this.money;
	}
}

class NotEnoughMoneyException extends Exception{
	public NotEnoughMoneyException() {
		System.out.println("NotEnoughMoneyException: !! �ܾ��� ������� �ʽ��ϴ�.");
	}
}

class InvalidMoneyException extends Exception{
	public InvalidMoneyException() {
		System.out.println("InvalideMoneyException: !! �Ա� �׼��� �߸��Ǿ����ϴ�.");
	}
}