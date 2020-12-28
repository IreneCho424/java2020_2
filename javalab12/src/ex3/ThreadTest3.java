package ex3;

//(예제3) 메인스레드 정보 출력 끝날 때까지 대기
//1817022 조이린

class MyThread3 extends Thread {
	private Object keyObj;

	public MyThread3(String name, Object keyObj) {
		super(name);
		this.keyObj = keyObj;
	}

	public void run() {
		long id = Thread.currentThread().getId(); // 스레드 ID 얻기
		String name = Thread.currentThread().getName(); // 스레드 이름 얻기
		int priority = Thread.currentThread().getPriority(); // 스레드 우선순위값 얻기
		Thread.State s = Thread.currentThread().getState(); // 스레드 상태 값 얻기

		synchronized (keyObj) { // 메인스레드에서 넘겨받은 키로 lock를 걸어 둠
			if (ThreadTest3.iswritten == false) { // wait하기 전에 메인스레드 정보가 다 쓰였는지 flag 검사
				try {
					keyObj.wait(); // 메인스레드 정보가 아직 출력되지 않았을 때만 기다리게 됨
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			System.out.println("2.현재 스레드 이름= " + name);
			System.out.println("2.현재 스레드 ID = " + id);
			System.out.println("2.현재 스레드 우선순위 값 = " + priority);
			System.out.println("2.현재 스레드 상태 = " + s);
		}
	}
}

public class ThreadTest3 {
	// 메인스레드 정보 출력이 끝났을 때 true가 되게 할 flag
	// volatile로 해서 항상 수정된 값을 읽을 수 있게 함
	public volatile static boolean iswritten = false;

	public static void main(String[] args) {
		Object keyObj = new Object();
		MyThread3 th = new MyThread3("MyThread2", keyObj); // 생성자를 이용 스레드 이름 지정
		th.start();

		long id = Thread.currentThread().getId(); // 스레드 ID 얻기
		String name = Thread.currentThread().getName(); // 스레드 이름 얻기
		int priority = Thread.currentThread().getPriority(); // 스레드 우선순위값 얻기
		Thread.State s = Thread.currentThread().getState(); // 스레드 상태 값 얻기

		synchronized (keyObj) { // 메인스레드에서 넘겨받은 키로 lock를 걸어 둠
			System.out.println("1.현재 스레드 이름= " + name);
			System.out.println("1.현재 스레드 ID = " + id);
			System.out.println("1.현재 스레드 우선순위 값 = " + priority);
			System.out.println("1.현재 스레드 상태 = " + s);
			System.out.println();

			try {
				iswritten = true; //메인스레드 정보 출력이 모두 끝났음을 flag에 기록
				keyObj.notify(); // wait 중인 스레드에게 알려서 깨움
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

}
