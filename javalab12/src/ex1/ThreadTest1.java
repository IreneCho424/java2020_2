package ex1;

//(����1) ������ �����
//1817022 ���̸�

class MyThread extends Thread{
	public void run() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum = sum + i;
			System.out.println(i + "���ϱ� ���: " + sum);
		}
		
		System.out.println("---------------------------");
		System.out.println("1~10 ���ϱ�: " + sum);
	}
}

class MyRunnable implements Runnable{
	public void run() {
		//int multiply = 0; //����� 0
		int multiply = 1;
		for (int i = 1; i <= 10 ; i++) {
			multiply = multiply * i;
			System.out.println(i + "���ϱ� ���: " + multiply);
		}
		
		System.out.println("---------------------------");
		System.out.println("1~10 ���ϱ�: " + multiply);
	}
}

public class ThreadTest1 {
	public static void main(String[] args) {
		//Thread Ŭ������ ����� ������ ����
		MyThread t1 = new MyThread();
		
		//Runnable ������ ������ ����
		//������ Thread(Runnable target)
		Thread t2 = new Thread(new MyRunnable());
		
		t1.start(); //������ ����
		t2.start(); //������ ����
		
		//���� ������ ����
		int sum = 0;
		for (int i = 1; i <= 10 ; i++) {
			sum = sum - i;
			System.out.println(i + "���� ���: " + sum);
		}
		
		System.out.println("---------------------------");
		System.out.println("1~10 ����: " + sum);
	}
}
