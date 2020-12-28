package ex1;

//(예제1) 스레드 만들기
//1817022 조이린

class MyThread extends Thread{
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println(i + "더하기 결과: " + sum);
		}
		
		System.out.println("---------------------------");
		System.out.println("1~10 더하기: " + sum);
	}
}

class MyRunnable implements Runnable{
	public void run() {
		//int multiply = 0; //결과는 0
		int multiply = 1;
		for (int i = 1; i <= 10 ; i++) {
			multiply = multiply * i;
			System.out.println(i + "곱하기 결과: " + multiply);
		}
		
		System.out.println("---------------------------");
		System.out.println("1~10 곱하기: " + multiply);
	}
}

public class ThreadTest1 {
	public static void main(String[] args) {
		//Thread 클래스를 상속한 스레드 생성
		MyThread t1 = new MyThread();
		
		//Runnable 구현한 스레드 생성
		//생성자 Thread(Runnable target)
		Thread t2 = new Thread(new MyRunnable());
		
		t1.start(); //스레드 실행
		t2.start(); //스레드 실행
		
		//메인 스레드 로직
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			sum = sum - i;
			System.out.println(i + "빼기 결과: " + sum);
		}
		
		System.out.println("---------------------------");
		System.out.println("1~10 빼기: " + sum);
	}
}
