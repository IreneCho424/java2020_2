package pm3;

//(�ǽ�3) ���� ���� ���� ���α׷�_ Account class
//1817022 ���̸�

public class Account{
	private int balance;
	private String owner;
	private double rate;
	
	public Account(String owner, double rate) {
		this.owner = owner;
		this.rate = rate;
		this.balance = 0;
	}
	public Account(String owner, int balance, double rate) {
		this.owner = owner;
		this.balance = balance;
		this.rate = rate;
	}
	public void deposit(int m) {		//�Ա�
		this.balance = this.balance + m;
	}
	public void withdraw(int m) {		//���
		this.balance = this.balance - m;
	}
	public void computeTotal() {		//1��ġ ���� ��� �� �ܰ� ����
		this.balance += this.balance * this.rate / 12.0;
	}
	public void computeTotal(int m) {	//m��ġ ���� ��� �� �ܰ� ����
		this.balance += this.balance * this.rate * m / 12.0;
	}
	public void showAll() {				//���� ���� �����ֱ�
		System.out.println("Owner = " + this.owner);
		System.out.println("Balance = " + this.balance);
		System.out.println("Rate = " + this.rate);
	}
	public void showBalance() {			//�ܰ� �����ֱ�
		System.out.println("Balance = " + this.balance);
	}
	public void showOwner() {			//���� ���� �����ֱ�
		System.out.println("Owner = " + this.owner);
	}
	public void showRate() {			//������ �����ֱ�
		System.out.println("Rate = " + this.rate);
	}
}