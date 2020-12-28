package pm3;

//(실습3) 은행 계정 관리 프로그램_ Account class
//1817022 조이린

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
	public void deposit(int m) {		//입금
		this.balance = this.balance + m;
	}
	public void withdraw(int m) {		//출금
		this.balance = this.balance - m;
	}
	public void computeTotal() {		//1달치 이자 계산 후 잔고에 더해
		this.balance += this.balance * this.rate / 12.0;
	}
	public void computeTotal(int m) {	//m달치 이자 계산 후 잔고에 더해
		this.balance += this.balance * this.rate * m / 12.0;
	}
	public void showAll() {				//계정 정보 보여주기
		System.out.println("Owner = " + this.owner);
		System.out.println("Balance = " + this.balance);
		System.out.println("Rate = " + this.rate);
	}
	public void showBalance() {			//잔고 보여주기
		System.out.println("Balance = " + this.balance);
	}
	public void showOwner() {			//계정 주인 보여주기
		System.out.println("Owner = " + this.owner);
	}
	public void showRate() {			//연이율 보여주기
		System.out.println("Rate = " + this.rate);
	}
}