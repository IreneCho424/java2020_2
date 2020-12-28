package pm1;

public class BankSynchronizedEx {
	public volatile static boolean nomoney = false;

	public static void main(String[] args) {
		Runnable runnable = new RunnableTest();
		Thread thread01 = new Thread(runnable);
		Thread thread02 = new Thread(runnable);

		thread01.start();
		thread02.start();
	}

}

class RunnableTest implements Runnable {
	Account account = new Account();

	public void run() {
		while (account.balance > 0) {
			int money = (int) (Math.random() * 3 + 1) * 100;
			account.withdraw(money);
			System.out.println(Thread.currentThread().getId() + " : balance : " + account.balance);
		}
		account.deposit(1000);
	}
}

class Account {
	int balance = 1000;

	public void withdraw(int money) {
		balance -= money;
	}

	public void deposit(int money) {
		balance += money;
	}
}