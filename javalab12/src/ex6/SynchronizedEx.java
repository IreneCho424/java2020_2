package ex6;

//(예제6) 집계판 만들기
//1817022 조이린

class SharedBoard{
	private int sum = 0; //집계판의 합
	
	public synchronized void add() {
		int n = sum;
		
		n += 10; //10 증가
		sum = n; //증가한 값을 집계합에 기록
		
		System.out.println(Thread.currentThread().getName() + " : " + sum);
	}
	public int getSum() {
		return sum;
	}
}

class StudentThread extends Thread{
	private SharedBoard board; //집계판의 주소
	public StudentThread(String name, SharedBoard board) {
		super(name);
		this.board = board;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			board.add();
		}
	}
}

public class SynchronizedEx {

	public static void main(String[] args) {
		SharedBoard board = new SharedBoard();
		
		Thread th1 = new StudentThread("kitae", board);
		Thread th2 = new StudentThread("hyosoo", board);
		
		th1.start();
		th2.start();
	}

}
