package ex2;

//(예제2) 스레드 정보 얻기
//1817022 조이린

class MyThread2 extends Thread{
	public MyThread2(String name) {
		super(name);
	}
	
	public void run() {
		long id = Thread.currentThread().getId(); //스레드 ID 얻기
		String name = Thread.currentThread().getName(); //스레드 이름 얻기
		int priority = Thread.currentThread().getPriority(); //스레드 우선순위값 얻기
		Thread.State s = Thread.currentThread().getState(); //스레드 상태 값 얻기
		
		System.out.println("2.현재 스레드 이름= " + name);
		System.out.println("2.현재 스레드 ID = " + id);
		System.out.println("2.현재 스레드 우선순위 값 = " + priority);
		System.out.println("2.현재 스레드 상태 = " + s);
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		MyThread2 th = new MyThread2("MyThread2"); //생성자를 이용 스레드 이름 지정
		th.start();

		long id = Thread.currentThread().getId(); //스레드 ID 얻기
		String name = Thread.currentThread().getName(); //스레드 이름 얻기
		int priority = Thread.currentThread().getPriority(); //스레드 우선순위값 얻기
		Thread.State s = Thread.currentThread().getState(); //스레드 상태 값 얻기
		
		System.out.println("1.현재 스레드 이름= " + name);
		System.out.println("1.현재 스레드 ID = " + id);
		System.out.println("1.현재 스레드 우선순위 값 = " + priority);
		System.out.println("1.현재 스레드 상태 = " + s);
	}

}
