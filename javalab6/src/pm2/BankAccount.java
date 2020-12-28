package pm2;

//(실습2) 사용자 정의 예외처리 - 예금 관리 프로그램
//1817022 조이린

public class BankAccount{
	private int money = 50000;
	
	public void withdraw(int m) {	//인출
		this.money -= m;
	}
	
	public void deposit(int m) {	//입금
		this.money += m;
	}
	
	public void printMoney() {		//현재 잔액 출력
		System.out.println("잔액: " + this.money + "원");
	}
	public int getMoney() {
		return this.money;
	}
}

class NotEnoughMoneyException extends Exception{
	public NotEnoughMoneyException() {
		System.out.println("NotEnoughMoneyException: !! 잔액이 충분하지 않습니다.");
	}
}

class InvalidMoneyException extends Exception{
	public InvalidMoneyException() {
		System.out.println("InvalideMoneyException: !! 입금 액수가 잘못되었습니다.");
	}
}